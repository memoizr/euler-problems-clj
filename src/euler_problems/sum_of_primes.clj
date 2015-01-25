(ns euler-problems.sum-of-primes)

(require '[libs.prime :as prime])

(defn main []
  (reduce + (take-while #(< % 2000000) (prime/lazy-primes))))
