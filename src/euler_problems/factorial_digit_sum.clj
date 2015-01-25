(ns euler-problems.factorial-digit-sum)

(defn factorial [x]
  (loop [n x acc 1]
    (if (= 1 n) acc
    (recur (dec n) (*' acc n)))))

(defn sumall [x]
  (apply +
         (map #(Character/digit % 10) (str x))))


(defn main []
  (sumall (factorial 100)))

