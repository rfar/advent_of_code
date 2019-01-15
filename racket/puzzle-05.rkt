;; (split-at (port->string (open-input-file "/media/HDD/Codes/racket/advent/res/input-05.txt")) '\n')

(define in-file "/media/HDD/Codes/racket/advent/res/input-05.txt")

(define (file->numbers f)
  (map (lambda (s)
         (string->number s))
       (file->lines f)))

(define (solve f)
  (let ([nums (file->numbers f)])
    (println (vector-length nums))))

(solve in-file)

;; Playground
;; (string-split)
;; (read-line)

;; (defn jump [i jc v]
;;   (let [js (get v i)
;;         t (+ i js)]
;;     (do
;;       (println v)
;;       (if (>= t (count v))
;;         (inc jc)
;;         (jump t (inc jc) (update v i inc))))))

;; (defn solve [f]
;;   (let [nums (vec (map read-string (str/split-lines (slurp f))))]
;;     (loop [i 0 jc 0 v nums]
;;       (let [js (get v i)
;;             t (+ i js)]
;;         (if (>= t (count v))
;;           (inc jc)
;;           (recur t (inc jc) (update v i inc)))))))
