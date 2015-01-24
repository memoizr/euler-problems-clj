(ns euler-problems.even_fibonacci_numbers)

(require '[libs.fibonacci :as fib])

(defn even_fibonacci_numbers []
  (println (reduce + (filter #(= 0 (mod % 2)) (take-while #(< % 4000000) fib/lazy-fib-seq)))))
