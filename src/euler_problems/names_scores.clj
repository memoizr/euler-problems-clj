(ns euler-problems.names-scores)

(def file
  (slurp
    (.getFile
     (clojure.java.io/resource "p022_names.txt"))))

(def input
  (sort (clojure.string/split file #",")))

(defn alpha-value [word]
  (+ 60 (reduce + (map #(- (int %) 64) word))))

(defn numscore [lst]
  (loop [position 1 data lst acc 0]
    (cond (nil? (first data)) acc
      :else (recur (inc position) (rest data) (+ (* position (alpha-value (first data))) acc)))))

(defn main []
  (numscore input))
