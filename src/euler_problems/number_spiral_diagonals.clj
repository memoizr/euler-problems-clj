(ns euler-problems.number-spiral-diagonals)

(def odd-squares (take-while #(< % (inc (* 1001 1001))) (map #(* % %) (filter odd? (range)))))

(defn main []
  (loop [lst odd-squares i 1 sum 1]
    (if (empty? lst) sum
      (recur (rest lst) (+ 2 i) (+ sum (reduce + (take 4 (take-nth (dec i) (range (first lst) 1 -1)))))))))

