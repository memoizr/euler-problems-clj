(ns libs.math)

(defn factors [n]
  (into (sorted-set)
        (reduce concat
                (for [x (range 1 (inc (Math/sqrt n))) :when (zero? (rem n x))]
                  [x (/ n x)]))))

(defn triangular-lazy-seq
  ([] (triangular-lazy-seq 0 1))
  ([sum n]
   (let [new-sum (+ sum n)]
     (cons new-sum (lazy-seq (triangular-lazy-seq new-sum (inc n)))))))

(defn nth-triangular-number [n]
  (loop [x n total 0]
    (if (= x 0) total
      (recur (dec x) (+ x total))
    )))

(defn factorial [x]
  (if
    (>= 0 x) 1
    (loop [n x acc 1]
      (cond
        (= 1 n) acc
        :else (recur (dec n) (*' acc n))))))
