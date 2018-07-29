(ns advent-of-code.core
  (:require [clojure.string :as str]))

;; Caculated from `4 * l * (l + 1) >= n` which reduces to: `l >= (sqrt(n) - 1) / 2`
(defn loop-num [n]
  "Calculates the loop number containing the number n"
  (-> n
      Math/sqrt
      dec
      (/ 2)
      Math/floor))
;;   (Math/floor (/ (dec (Math/sqrt n)) 2)))

(defn offset-from-center [n l]
  "Calculates the offset of the number n from the loop's center element
  irrespective of which side of the loop it is situated")

(defn solve [n]
  (loop-num n))

(solve 265149)

;; Playground
;; The n-th loop around 1 contains 8n elements.
;; Hence the total number of elements within the n loops are: 1 + 4n(n + 1).
;; By finding the loop number where a specific number is placed and also
;; Manhattan Distance is calculated as loop number plus its offset from the
;; center of loop's edge.
;; Actually we'd better calculate the formula for the center number on each
;; of the four edges of each loop.
(quot 11 2)
(dec (Math/sqrt 81))
