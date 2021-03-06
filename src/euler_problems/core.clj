(ns euler-problems.core
  (:gen-class))

(require '[euler-problems.even-fibonacci-numbers :as even_fibonacci_numbers])
(require '[euler-problems.largest-prime-factor :as largest-prime-factor])
(require '[euler-problems.largest-palindrome :as largest-palindrome])
(require '[euler-problems.sum-square-difference :as sum-square-difference])
(require '[euler-problems.nth-prime :as nth-prime])
(require '[euler-problems.largest-product-grid :as largest-product-grid])
(require '[euler-problems.largest-product-series :as largest-product-series])
(require '[euler-problems.pythagorean-triplet :as pythagorean-triplet])
(require '[euler-problems.sum-of-primes :as sum-of-primes])
(require '[euler-problems.highly-divisible-triangular :as highly-divisible-triangular])
(require '[euler-problems.large-sum :as large-sum])
(require '[euler-problems.largest-collatz-sequence :as largest-collatz-sequence])
(require '[euler-problems.lattice-paths :as lattice-paths])
(require '[euler-problems.power-digit-sum :as power-digit-sum])
(require '[euler-problems.maximum-path-sum-1 :as maximum-path-sum-1])
(require '[euler-problems.maximum-path-sum-2 :as maximum-path-sum-2])
(require '[euler-problems.factorial-digit-sum :as factorial-digit-sum])
(require '[euler-problems.amicable-numbers :as amicable-numbers])
(require '[euler-problems.thousand-digit-fibonacci :as thousand-digit-fibonacci])
(require '[euler-problems.number-letter-counts :as number-letter-counts])
(require '[euler-problems.names-scores :as names-scores])
(require '[euler-problems.distinct-prime-factors :as distinct-prime-factors])
(require '[euler-problems.self-powers :as self-powers])
(require '[euler-problems.non-abundant-sums :as non-abundant-sums])
(require '[euler-problems.quadratic-primes :as quadratic-primes])
(require '[euler-problems.number-spiral-diagonals :as number-spiral-diagonals])
(require '[euler-problems.digit-fifth-powers :as digit-fifth-powers])
(require '[euler-problems.digit-factorials :as digit-factorials])
(require '[euler-problems.circular-primes :as circular-primes])
(require '[euler-problems.truncatable-primes :as truncatable-primes])

(defn -main
  "Run problems"
  [& args]
  ;(println (even_fibonacci_numbers/main))
  ;(println (largest-prime-factor/main))
  ;(println (sum-square-difference/main))
  ;(println (largest-palindrome/main))
  ;(println (nth-prime/main))
  ;(println (largest-product-grid/main))
  ;(println (largest-product-series/main))
  ;(println (pythagorean-triplet/main))
  ;(println (sum-of-primes/main))
  ;(println (highly-divisible-triangular/main))
  ;(println (large-sum/main))
  ;(println (largest-collatz-sequence/main))
  ;(println (lattice-paths/main))
  ;(println (power-digit-sum/main))
  ;(println (maximum-path-sum-1/main))
  ;(println (maximum-path-sum-2/main))
  ;(println (factorial-digit-sum/main))
  ;(println (amicable-numbers/main))
  ;(println (thousand-digit-fibonacci/main))
  ;(println (number-letter-counts/main))
  ;(println (names-scores/main))
  ;(println (self-powers/main))
  ;(println (distinct-prime-factors/main))
  ;(println (non-abundant-sums/main))
  ;(println (quadratic-primes/main))
  ;(println (number-spiral-diagonals/main))
  ;(println (digit-fifth-powers/main))
  ;(println (digit-factorials/main))
  ;(println (circular-primes/main))
  (println (truncatable-primes/main))
  )
