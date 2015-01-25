(ns euler-problems.thousand-digit-fibonacci)

(require '[libs.fibonacci :as fib])

(defn get-n-digit-long [n]
  (take-while #(< (count (str %)) 1000) fib/lazy-fib-seq))

(defn main []
  (count (get-n-digit-long 1000)))
