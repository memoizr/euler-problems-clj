(ns euler-problems.digit-factorials)

(require '[libs.math :as math])

(def factmemo (memoize math/factorial))

(defn main []
  (reduce +
      (for [i (range 144 100000) :when
        (= i (reduce + (map #(factmemo (- (int %) 48)) (str i))))]
      i)))
