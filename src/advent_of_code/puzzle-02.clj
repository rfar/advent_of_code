(ns advent-of-code.core
  (:require [clojure.string :as str]))

(defn solve [input]
  "Gives the result of the puzzle."
  (apply max
         (map read-string
              (str/split
                (get (str/split-lines (slurp input)) 0)
                #"\s+"))))

(solve "resources/input-02.txt")

;; Playground
(max 4347 3350 196 162 233 4932 4419 3485 4509 4287 4433 4033 207 3682 2193 4223)
