(ns advent-of-code.core
  (:require [clojure.string :as str]))

(defn phrase-valid [s]
  (= 1 (apply max (vals (frequencies (str/split s #"\s+"))))))

(defn solve [f]
  (let [phrases (str/split-lines (slurp f))]
    (get (frequencies (map phrase-valid phrases))
         true)))

(solve "resources/input-04.txt")

;; Playground
; (phrase-valid "ofvaegv hgak oafevgv hkemar rqkha grklnsp msvkkku rekahm bxmjnw")
