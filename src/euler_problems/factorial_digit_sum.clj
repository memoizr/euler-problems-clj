(ns euler-problems.factorial-digit-sum)

(require '[libs.math :as math])

(defn sumall [x]
  (apply +
         (map #(Character/digit % 10) (str x))))

(defn main []
  (sumall (math/factorial 100)))

