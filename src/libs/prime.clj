(ns libs.prime)

(defn prime-factors
  ([n]
   (prime-factors n 2 '()))
  ([n candidate acc]
   (cond (<= n 1) (reverse acc)
         (zero? (rem n candidate)) (recur (/ n candidate) candidate (cons candidate acc))
         :else (recur n (inc candidate) acc))))
