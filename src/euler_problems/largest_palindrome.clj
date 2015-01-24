(ns euler-problems.largest-palindrome)

(defn reverse-number [number reversed]
  (if (= number 0)
    reversed
    (reverse-number (quot number 10)
                    (+ (rem number 10) (* reversed 10)))))

(defn main []
  (apply max (filter (fn [x] (= (reverse-number x 0) x)) (for [x1 (range 100 999) x2 (range 100 999)] (* x1 x2)))))

