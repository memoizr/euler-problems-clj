(ns euler-problems.distinct-prime-factors)

(require '[libs.math :as math])
(require '[libs.prime :as prime])
(require '[clojure.core.reducers :as r])

(def memo-prime? (memoize prime/prime?))

(defn distinct-prime-facts [x threshold]
  (= threshold (count (into [] (r/filter memo-prime? (math/factors x))))))

(defn find-consecutives [threshold]
  (loop [n 1 acc 0]
    (cond
      (= acc threshold) (- n threshold)
      (distinct-prime-facts n threshold)
        (recur (inc n) (inc acc))
      :else
        (recur (inc n) 0))))

(defn main []
  (find-consecutives 4))


