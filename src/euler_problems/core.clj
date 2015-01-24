(ns euler-problems.core
  (:gen-class))

(require 'euler-problems.hello)
(refer 'euler-problems.hello)
(require 'euler-problems.even_fibonacci_numbers)
(refer 'euler-problems.even_fibonacci_numbers)
(require '[euler-problems.largest-prime-factor :as largest-prime-factor])

(defn -main
  "Run problems"
  [& args]
  (even_fibonacci_numbers)
  (println (largest-prime-factor/main))
  )
