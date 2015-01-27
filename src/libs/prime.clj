(ns libs.prime)

(defn prime-factors
  ([n]
   (prime-factors n 2 '()))
  ([n candidate acc]
   (cond (<= n 1) (reverse acc)
         (zero? (rem n candidate)) (recur (/ n candidate) candidate (cons candidate acc))
         :else (recur n (inc candidate) acc))))

(defn slow-prime? [n]
  (every? #(pos? (rem n %)) (range 2 (Math/sqrt (inc n)))))

;; much faster than the above method

(defn prime? [n]
    (.isProbablePrime (BigInteger/valueOf n) 6))

(defn lazy-primes []
  (filter prime? (drop 2 (range))))
