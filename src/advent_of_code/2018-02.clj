(ns advent-of-code.core
  (:require [clojure.string :as str]))

(defn solve-2018-02 [f]
  (let [raw-input (str/split-lines (slurp f))
        freq-2 (reduce (partial add-freq-of 2) 0 raw-input)
        freq-3 (reduce (partial add-freq-of 3) 0 raw-input)]
    (* freq-2 freq-3)))

(defn add-freq-of [f c s]
  (let [idx (.indexOf (vals (frequencies s)) f)]
    (if (= idx -1) c (inc c))))

(solve-2018-02 "resources/2018-02.txt")

;; Playground:
(.indexOf (vals (frequencies "qysdgimlcaghpfozuwejmhrbvx")) 3)
(contains-with-freq 10 "qysdgimlcaghpfozuwejmhrbvx" 3)

