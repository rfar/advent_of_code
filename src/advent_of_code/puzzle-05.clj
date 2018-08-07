(ns advent-of-code.core
  (:require [clojure.string :as str]))

(defn update-jump-count [jc js]
  (if (zero? js)
    jc
    (inc jc)))

(defn jump [i jc v]
  (let [js (get v i)
        t (+ i js)]
    (if (>= t (count v))
      (inc jc)
      (jump t (update-jump-count jc js) (update v i inc)))))

(defn solve [f]
  (let [v (vec (map read-string (str/split-lines (slurp f))))]
    (jump 0 1 v)))

(solve "resources/input-05.txt")

;; Playground
;; (jump 0 1 [0 3 0 1 -3])
(update [0 1 2 3] 2 #((constantly -1) %))
(get [0 1 3 8] 2)
