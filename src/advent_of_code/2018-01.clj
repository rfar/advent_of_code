(ns advent-of-code.core
  (:require [clojure.string :as str]))

(defn solve-2018-01 [f]
  (let [raw-input (str/split-lines (slurp f))
        freqs (map #(Integer. %) raw-input)]
    (reduce + freqs)))

;; Playground
(solve-2018-01 "resources/2018-01.txt")
