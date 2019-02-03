(ns advent-of-code.core
  (:require [clojure.string :as str]))

(defn row-min-max-diff [row-str]
  (let [row-num (map read-string (str/split row-str #"\s+"))]
    (- (apply max row-num) (apply min row-num))))

(defn solve [input]
  "Gives the result of the puzzle."
  (reduce + (map row-min-max-diff (str/split-lines (slurp input)))))

(println (solve "resources/input-02.txt"))

;; Playground
;(max 4347 3350 196 162 233 4932 4419 3485 4509 4287 4433 4033 207 3682 2193 4223)
