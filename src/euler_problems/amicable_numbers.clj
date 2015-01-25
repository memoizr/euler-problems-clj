(ns euler-problems.amicable-numbers)

(require '[libs.math :as math])

(defn divisors [n]
  (butlast (math/factors n)))

(defn sumall [coll]
  (reduce + coll))

(def sumall-memo (memoize sumall))
(def divisors-memo (memoize divisors))

(defn sumdiv [x]
  (sumall-memo (divisors-memo x)))

(def sumdiv-memo (memoize sumdiv))

(defn amicable? [a b]
  (and
    (= (sumdiv-memo a) b)
    (= (sumdiv-memo b) a)))

(defn mapamicable []
  (for [x (range 10000) y (range x 10000) :when (and (not= x y) (amicable? x y))]
    [x y]))

(defn main []
  (sumall (flatten (mapamicable))))

