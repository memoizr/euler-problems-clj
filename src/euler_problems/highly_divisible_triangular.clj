(ns euler-problems.highly-divisible-triangular)

(require '[libs.math :as math])

(defn factors-count [n]
  (count (math/factors n)))

(def trignum-memo (memoize math/nth-triangular-number))
(def factors-memo (memoize factors-count))

(defn trignum-by-divisor-memo [n]
  (loop [x 0 divisors 0]
    (if (>= divisors n)
      (trignum-memo x)
      (recur (inc x) (factors-memo (trignum-memo (inc x)))))))

(defn main []
  (trignum-by-divisor-memo 500))


