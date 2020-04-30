(ns advent-of-code.2019-01
  (:require [clojure.string :as str]
            [advent-of-code.utils :as utils]))

(def INPUT-FILE "resources/2019-01.txt")

(defn compute-fuel [mass]
  (- (quot mass 3) 2))

(defn solve []
  (->> (utils/get-infile-lines INPUT-FILE)
       (map read-string)
       (reduce #(+ %1 (compute-fuel %2)) 0)))

;; (defn solve []
;;   (let [file-contents (slurp INPUT-FILE)
;;         mass-vals (map read-string (str/split-lines file-contents))]
;;     (reduce #(+ %1 (compute-fuel %2)) 0 mass-vals)))

;; Playground
(solve)
(compute-fuel 100756)
