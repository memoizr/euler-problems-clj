(ns libs.fibonacci)

(defn fib-seq [top]
  (loop [a 0 b 1 acc []]
       (if (< a top)
         (recur b (+ a b) (conj acc a))
         acc)))

(def lazy-fib-seq
  (lazy-cat [0 1] (map +' (rest lazy-fib-seq) lazy-fib-seq)))
