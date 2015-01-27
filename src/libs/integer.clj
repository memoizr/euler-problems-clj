(ns libs.integer)

(defn to-int-seq [number]
  (map #(- (int %) 48) number))
