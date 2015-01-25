(ns euler-problems.lattice-paths)

(defn fact [x]
  (loop [n x acc 1]
    (if (= n 1) acc
      (recur (dec n) (*' acc n)))))

(defn lattice-paths [m n]
  (/ (fact (+ m n)) (*' (fact m) (fact n))))

(defn main []
  (lattice-paths 20 20))
