(ns euler-problems.largest-prime-factor)

(require '[libs.prime :as prime])

(def target 600851475143)

(defn largest-prime-factor [n]
  (apply max (prime/prime-factors n)))

(defn main []
  (largest-prime-factor target))
