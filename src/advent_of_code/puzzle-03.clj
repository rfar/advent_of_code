(ns advent-of-code.core
  (:require [clojure.string :as str]))

;; The l-th loop around 1 contains 8l elements.
;; Hence the total number of elements within the l loops are: 1 + 4l(l + 1).
;; The first (top-right) corner of the loop l is allocated to the item
;; numbered 2l(2l - 1) + 1 since each side is 2l long (each loop 8l).
;; -------------------------------------------------------------------------
;; By finding the loop number where a specific number is placed and also
;; Manhattan Distance is calculated as loop number plus its offset from the
;; center of loop's edge. Hence the Manhattan Distance from the center for
;; all elements on the loop l has a minimum of l for the items horizontally
;; or vertically alligned with the center and a maximum 2l for the items on
;; the corners.

(defn count-loop-items [l]
  (inc (* (inc l) (* 4 l))))

(defn loop-num [n]
  "Calculates the loop number containing the number `n` from"
  "`4 * l * (l + 1) >= n` which reduces to: `l >= (sqrt(n) - 1) / 2`"
  (-> n
      Math/sqrt
      dec
      (/ 2)
      Math/ceil))

(defn order-in-loop [n l]
  "Calculates the order of the number n within the loop l"
  (- n (count-loop-items (dec l))))

;; Note that corners are numbered CCW, i.e. corners 0 to 3 are
;; top-right, top-left, bottom-left and bottom-right, respectively:
(defn corner [l i]
  "The top right corner item is calculated to be 2l(2l + 1) - 1"
  "Each next one is 2l items apart."
  (let [dbl (* 2 l)]
    (+ (* i dbl)
       (+ (* dbl (dec dbl)) 1))))

(defn pos-from-corner [n l]
  (mod (order-in-loop n l) (* 2 l)))

(defn solve [n]
  "Manhattan Distance is obtained as loop number plus offset from
  the center element on each side of the loop."
  (let [target-loop (loop-num n)
        pos-on-side (pos-from-corner n target-loop)
        half-side target-loop]
    (+ target-loop (Math/abs (- pos-on-side half-side)))))

(solve 265149)

;; Playground
(quot 11 2)
(dec (Math/sqrt 81))
(* 4 257 258)
(count-loop-items 256)
(corner (loop-num 265149) 3)
