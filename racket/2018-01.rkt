#lang racket/base
(require racket/file)

(define (file->numbers f)
  (map (lambda (s)
         (string->number s))
       (file->lines f)))

(define (solve f)
  (foldl +
         0
         (file->numbers f))
  )

(solve "../resources/2018-01.txt")
