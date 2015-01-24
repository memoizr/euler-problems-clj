(ns euler-problems.sum-square-difference)

(defn sum-of-squares [n]
  (reduce + (map #(* % %) (range (inc n)))))

(defn square-of-sum [n]
  (let [sum (reduce + (range (inc n)))]
  (* sum sum)))

(defn main []
  (- (square-of-sum 100) (sum-of-squares 100)))
