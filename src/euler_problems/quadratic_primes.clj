(ns euler-problems.quadratic-primes)

(require '[libs.prime :as prime])

(defn eulers [n a b]
  (+ (* n n) (* a n) b))

(defn main []
  (let [quadratic-prime (apply max-key :consec (for [a (range -1000 1000) b (range -1000 1000)]
                                 (loop [n 0]
                                   (cond
                                         (prime/prime? (eulers n a b))
                                           (recur (inc n))
                                         :else {:consec n :a a :b b}))))]
  (reduce * (map val
                 (select-keys quadratic-prime [:a :b])))))
