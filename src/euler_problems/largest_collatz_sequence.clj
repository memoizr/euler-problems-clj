(ns euler-problems.largest-collatz-sequence)

(defn collatz-length [n]
  (loop [x n acc ()]
    (cond
          (<= x 1) (inc (count acc))
          (zero? (rem x 2))
          (recur (/ x 2) (cons x acc))
          :else (recur (inc (*' 3 x)) (cons x acc)))))

(defn longest-collatz [n]
  (loop [i 1 acc 0 result 0]
    (cond
      (= i n) result
      (> (collatz-length i) acc) (recur (inc i) (collatz-length i) i)
      :else (recur (inc i) acc result))))

(defn main []
  (longest-collatz 1000000))

;================================
;================================

; Another possible implementation.
; It is also correct but it runs about 4 times slower.

(defn collatz1 [start]
  (cons start ((defn sub-collatz [n]
                 (cond (= 1 n) nil
                       (zero? (mod n 2)) (cons (/ n 2) (lazy-seq (sub-collatz (/ n 2))))
                 :else (cons (inc (* n 3)) (lazy-seq (sub-collatz (inc (* n 3)))))))
               start)))

(defn f
  ([c] c)
  ([c1 c2] (if (> (count c1) (count c2)) c1 c2)))

(defn alternative-solution []
  (time (first (reduce f (map collatz1 (range 2 1000001))))))
