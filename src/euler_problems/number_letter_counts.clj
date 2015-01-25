(ns euler-problems.number-letter-counts)

(def to-nine ["one" "two" "three" "four" "five" "six" "seven" "eight" "nine"])
(def teens ["ten" "eleven" "twelve" "thirteen" "fourteen" "fifteen" "sixteen" "seventeen" "eighteen" "nineteen"])
(def tens ["ten" "twenty" "thirty" "forty" "fifty" "sixty" "seventy" "eighty" "ninety"])

(def hundred "hundred")

(def conjunction "and")

(defn count-twenty []
  (loop [n 0 lst to-nine acc []]
    (if (= n 9) acc
      (recur (inc n) (rest lst) (cons (first lst) acc)))))

(def the-teens
      (into to-nine teens))

(defn round-hundreds [n]
        (str (nth to-nine (dec (quot n 100))) hundred))

(defn teens-hundreds [n]
        (str (nth to-nine (dec (quot n 100))) hundred conjunction (nth the-teens (dec (mod n 100)))))

(defn round-tens [n]
        (nth tens (dec (quot n 10))))

(defn other-tens [n]
        (str (tens (dec (quot n 10))) "" (nth to-nine (dec (mod n 10)))))

(defn other-hundreds [n]
        (str (nth to-nine (dec (quot n 100))) hundred conjunction (other-tens (mod n 100)) ))

(defn rount-tens-hundreds [n]
        (str (nth to-nine (dec (quot n 100))) hundred conjunction (round-tens (mod n 100)) ))

(def lst ((fn fnc [n acc]
    (cond
      (= n 1000) (conj acc "onethousand")

      (< n 20) (fnc (+ n 20) the-teens)

      (= 0 (mod n 100))
        (fnc (inc n) (conj acc (round-hundreds n)))

      (and (< 0 (quot n 100)) (> 20 (mod n 100)))
        (fnc (inc n) (conj acc (teens-hundreds n)))

      (and (< 0 (quot n 100)) (<= 20 (mod n 100)) (not (= 0 (mod n 10))))
        (fnc (inc n) (conj acc (other-hundreds n)))

      (and (< 0 (quot n 100)) (<= 20 (mod n 100)) (= 0 (mod n 10)))
        (fnc (inc n) (conj acc (rount-tens-hundreds n)))

      (= 0 (mod n 10))
        (fnc (inc n) (conj acc (round-tens n)))

      :else
        (fnc (inc n) (conj acc (other-tens n)))

        ))
  0 []))


(defn main []
  (count (apply str lst)))
