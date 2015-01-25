(ns euler-problems.power-digit-sum)

(defn exp [x exp]
      (loop [n 0 acc 1]
        (if (= n exp) acc
          (recur (inc n) (*' acc x)))))

(defn sumall [x]
  (apply +
         (map #(Character/digit % 10) (str x))))

(defn main []
  (sumall (exp 2 1000)))
