(ns euler-problems.digit-fifth-powers)

(defn to-fifth [n]
  (* n n n n n))

(def memo-to-fifth (memoize to-fifth))

(defn main []
  (reduce +
          (for [i (range 2 500000) :when
            (= i (reduce + (map #(memo-to-fifth (- (int %) 48)) (str i))))]
          i)))


