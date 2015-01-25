(ns euler-problems.pythagorean-triplet)

(defn pythagorean-triplet []
  (for [a (range 1 300) b (range a 400) c (range b 500)
        :when (and (= (* c c) (+ (* a a) (* b b))) (= (+ a b c) 1000)) ]
      [a b c]))

(defn main []
  (apply * (flatten  (pythagorean-triplet))))

