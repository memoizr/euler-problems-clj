(ns euler-problems.even-fibonacci-numbers)

(require '[libs.fibonacci :as fib])

(defn main []
  (println (reduce + (filter #(= 0 (mod % 2)) (take-while #(< % 4000000) fib/lazy-fib-seq)))))
