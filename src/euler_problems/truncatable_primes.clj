(ns euler-problems.truncatable-primes)

(require '[libs.prime :as prime])

(def primes (map str (filter prime/prime? (range))))

(defn truncatable-left? [x]
  (loop [number x]
    (cond
      (empty? number) true
      (prime/prime? (Integer. number))
        (recur (clojure.string/join "" (rest number)))
      :else false )))

(defn truncatable-right? [x]
  (loop [number x]
    (cond
      (empty? number) true
      (prime/prime? (Integer. number))
        (recur (clojure.string/join "" (butlast number)))
      :else false )))


(defn truncatable? [x]
  (and (truncatable-right? x) (truncatable-left? x)))

(defn main []
  (reduce + (take 11 (drop 4 (map read-string (filter truncatable? primes))))))
