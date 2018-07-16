(ns advent-of-code.core)

(defn find-repeated
  [input]
  (if (= (first input) (second input))
    (cons (first input) find-repeated)
    (find-repeated)))

(defn sum-repeated
  [rep]
  (reduce + rep))
