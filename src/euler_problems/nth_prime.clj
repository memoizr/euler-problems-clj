(ns euler-problems.nth-prime)

(require '[libs.prime :as prime])

(defn main []
  (nth (prime/lazy-primes) 10000))




