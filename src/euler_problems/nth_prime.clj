(ns euler-problems.nth-prime)

(require '[clojure.core.reducers :as r])

(defn prime? [n]
  (every? #(pos? (rem n %)) (range 2 (Math/sqrt (inc n)))))

(defn lazy-primes []
  (filter prime? (drop 2 (range))))

(defn main []
  (nth (lazy-primes) 10000))




