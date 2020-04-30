(ns advent-of-code.utils
  (:require [clojure.string :as str]))

;; (defn on-infile [f-vec])

(defn get-infile-lines [f]
  (->> f
       slurp
       str/split-lines))
