(ns euler-problems.non-abundant-sums)

(require '[libs.math :as math])

(def abundants (do
                 (filter #(> (reduce + (butlast (math/factors %))) %) (range))))

(defn sum-rest [x abt limit]
    (loop [lst abt acc '()]
      (let [sum (+ x (first lst))]
        (cond
          (> sum limit) acc
          :else (recur (rest lst) (cons sum acc))))))

(defn abundant-sum-list [abt limit]
  (let [lmt (quot limit 2)]
    (loop [lst abt acc #{}]
      (cond
        (> (first lst) lmt) acc
        :else (recur (rest lst) (into acc (sum-rest (first lst) lst limit)))))))

(defn main []
  (let [abs (abundant-sum-list (take-while #(> 22000 %) abundants) 22000)]
  (reduce + (filter #(not (abs %)) (range 22000)))))

