(ns clojure-train.vectorall)

(println (get (vector 3 2) 1))

(println (conj (vector 3 2) 1))

(println (pop (vector 3 2 4 5)))

(println (subvec (vector 3 2 4 5) 1 3))
