(ns advent-of-code.core
  (:require [clojure.string :as str]))

(solve 265149)

;; Playground
;; The n-th loop around 1 contains 8n elements.
;; Hence the total number of elements within the n loops are: 1 + 4n(n + 1).
;; By finding the loop number where a specific number is placed and also
;; Manhattan Distance is calculated as loop number plus its offset from the
;; center of loop's edge.
;; Actually we'd better calculate the formula for the center number on each
;; of the four edges of each loop.
