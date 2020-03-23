(ns clojure-train.mapall)

(println (hash-map "Name" "Derek" "Age" 42))

(println (sorted-map 3 42 2 "Banas" 1 "Derek"))

(println (get (hash-map "Name" "Derek" "Age" 42) "Name"))

(println (find (hash-map "Name" "Derek" "Age" 42) "Name"))

(println (contains? (hash-map "Name" "Derek" "Age" 42) "Name"))

(println (keys (hash-map "Name" "Derek" "Age" 42)))

(println (vals (hash-map "Name" "Derek" "Age" 42)))

(println (merge-with + (hash-map "Name" "Derek") (hash-map  "Age" 42)))