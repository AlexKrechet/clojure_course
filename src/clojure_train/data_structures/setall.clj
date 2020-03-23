(ns clojure-train.setall)

(println (set '(1 1 2)))

(println (get (set '(1 2)) 2))

(println (conj (set '(1 2)) 3))

(println (contains? (set '(1 2)) 2))

(println (disj (set '(1 2 3)) 3))





