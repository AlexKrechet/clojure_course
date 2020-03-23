(ns clojure-train.destructuringall)

(defn destruct
  []
  (def vectVals [1 2 3 4])
  (let [[one two & the-rest] vectVals]
    (println one two the-rest)))

(defn -main
  [& args]
  (destruct)
  )

; destruct sample
(def v [42 "foo" 99.2 [5 12]])

(let [[x & rest] v]
  rest)

(let [[x _ z :as original-vector] v]
  (conj original-vector (+ x z)))
