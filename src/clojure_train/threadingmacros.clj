(ns clojure-train.threadingmacros)

(as-> [1 2 3 4 5 6] xs
      (map inc xs)
      (filter even? xs)
      (remove #(> % 5) xs)
      (vec xs)
      (str xs))

;;analogue
(str (vec (remove #(> % 5) (filter even? (map inc [1 2 3 4 5 6])))))

;;or will put argument after inc, even?, e.t.c
(->> [1 2 3 4 5 6]
      (map inc)
      (filter even?)
      (remove #(> % 5))
      (vec)
      (str))

;; will put argument after the function and before value like (+ 1 1)
;;or (- 2 2)
(-> 1
    (+ 1)
    (- 2)
    (str 3))

;; will work until there is a nil and will return nil
(some-> {:a {:b {:c 1}}} :a :x :c (+ 1))
