(ns euler-problems.circular-primes)

(require '[libs.prime :as prime])
(require '[clojure.string :as string])

(def primes (map str (filter prime/prime? (range 1 1000000))))

(defn to-int [x]
  (Integer. x))

(defn main []
  (count (filter #(not (nil? %))
    (loop [lst primes ac '()]
      (let [car (first lst)]
        (if (empty? lst) ac
          (recur (rest lst)
                 (cons (loop [number car counter 0 acc '()]
                                      (let [len (count number) numeric (Integer. number)]
                                        (cond
                                          (= counter len) acc
                                          (prime/prime? numeric)
                                            (recur (string/join "" (cons (last number)
                                                                                 (butlast number)))
                                                   (inc counter)
                                                   (cons numeric acc))
                                            :else nil
                                          )))
                       ac))))))))
