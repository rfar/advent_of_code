(ns advent-of-code.core)

(defn find-repeated
  [input]
  (if (empty? input)
    input
    (if (= (first input) (second input))
      (cons (first input) (find-repeated (rest input)))
      (find-repeated (rest input)))))

;; (defn sum-repeated
;;   [rep]
;;   (reduce + rep))

;; (defn read-file
;;   [file-name]
;;   (slurp file-name))

(defn puzzle-1 []
  (reduce + (map read-string
                 (map str
                      (find-repeated (slurp "resources/input-01.txt"))))))

(+ 2 (puzzle-1)) ;; 2 is the last number, since it's equal to the first one

;; Playground
(last [1 2 3 4 5])
(map str '(\3 \4 \5))
(read-string "3")
(Integer/parseInt "8")
(str \5)
