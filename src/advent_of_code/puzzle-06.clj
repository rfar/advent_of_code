(ns advent-of-code.core
  (:require [clojure.string :as str]))

(defn solve [f]
  (let [nums (vec (map read-string (str/split (slurp f) #"\s+")))]
    (zipmap (iterate inc 0) nums)))
;;     (do (println (apply max nums)))))

(solve "resources/input-06.txt")

;; Playground
;; (apply max [1 2 3 4 5 -2 17 9])
(zipmap [1 -1 2 -4 7 9 11] (iterate inc 0))
