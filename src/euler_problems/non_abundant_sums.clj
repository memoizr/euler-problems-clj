(ns euler-problems.non-abundant-sums)

(require '[libs.math :as math])

(def abundants (do
                 (filter #(> (reduce + (butlast (math/factors %))) %) (range))))

(defn lop [x abt]
    (loop [lst abt acc #{}]
      (cond
        (empty? lst) acc
        :else (recur (rest lst) (conj acc (+ x (first lst)))))))

(defn is-abundant-sum [abt]
  (loop [lst abt acc #{}]
    (cond
      (empty? lst) acc
      :else (recur (rest lst) (into acc (lop (first lst) lst))))))

(time (def abs (is-abundant-sum (take-while #(> 22000 %) abundants))))

(println (reduce + (filter #(not (abs %)) (range 22000))))

(defn ^long sum-pdivs
  [^long n]
  (let [lim (Math/sqrt n)]
    (if (even? n)
      (loop [i (int 2) res 1]
        (if (> i lim)
          res
          (let [divs (quot n i)]
            (if (== 0 (rem n i))
              (if (== i divs)
                (+ i res)
                (recur (inc i) (+ res i divs)))
              (recur (inc i) res)))))
      (loop [i (int 3) res 1]
        (if (> i lim)
          res
          (let [divs (quot n i)]
            (if (== 0 (rem n i))
              (if (== i divs)
                (+ res i)
                (recur (+ 2 i) (+ i res divs)))
              (recur (+ 2 i) res))))))))

(defn ^long non-abundant-sum
  [^long lim]
  (let [abuns (boolean-array lim)
        sum-abuns (boolean-array lim)]
    (do (loop [i 12]
          (if (< i lim)
            (recur (do (if (< i (sum-pdivs i))
                         (aset abuns i true))
                       (inc i)))
            i))
        (loop [i 12]
          (if (< i (quot lim 2))
            (recur (do (if (aget abuns i)
                         (loop [j i]
                           (if (< (+ i j) lim)
                             (recur (do (if (aget abuns j)
                                          (aset sum-abuns (+ i j) true))
                                        (inc j))))))
                       (inc i)))
            i))
        (->> (range 1 lim)
             (filter #(not (aget sum-abuns %)))
             (reduce +)))))

(println (non-abundant-sum 21000))
