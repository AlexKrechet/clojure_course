(ns clojure-train.listall)

(println (list "Dog" 1 3.4 true))

(println (first (list 1 2 3)))

(println (rest (list 1 2 3)))

(println (nth (list 1 2 3) 1))

;(def mylist (list 1 2 3))
;(println (nth mylist 1))
;(println (list* mylist [4]))

(println (list* 1 2 [3 4]))

(println (cons 4 (list 1 2 3)))

