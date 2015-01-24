(ns euler-problems.core
  (:gen-class))

(require '[euler-problems.even-fibonacci-numbers :as even_fibonacci_numbers])
(require '[euler-problems.largest-prime-factor :as largest-prime-factor])
(require '[euler-problems.largest-palindrome :as largest-palindrome])
(require '[euler-problems.sum-square-difference :as sum-square-difference])
(require '[euler-problems.nth-prime :as nth-prime])
(require '[euler-problems.largest-product-grid :as largest-product-grid])
(require '[euler-problems.largest-product-series :as largest-product-series])

(defn -main
  "Run problems"
  [& args]
  (println (even_fibonacci_numbers/main))
  (println (largest-prime-factor/main))
  (println (sum-square-difference/main))
  (println (largest-palindrome/main))
  (println (nth-prime/main))
  (println (largest-product-grid/main))
  (println (largest-product-series/main))
  )
