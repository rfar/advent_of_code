(ns advent-of-code.core
  (:require [clojure.string :as str]))

;; (defn update-jump-count [jc js]
;;   (if (zero? js)
;;     jc
;;     (inc jc)))

(defn jump [i jc v]
  (let [js (get v i)
        t (+ i js)]
    (do
      (println v)
      (if (>= t (count v))
        (inc jc)
        (jump t (inc jc) (update v i inc))))))

(defn solve [f]
  (let [nums (vec (map read-string (str/split-lines (slurp f))))]
    (loop [i 0 jc 0 v nums]
      (let [js (get v i)
            t (+ i js)]
        (if (>= t (count v))
          (inc jc)
          (recur t (inc jc) (update v i inc)))))))

(solve "resources/input-05.txt")

;; Playground
(jump 0 0 [0 3 0 1 -3])
(update [0 1 2 3] 2 #((constantly -1) %))
(get [0 1 3 8] 2)
