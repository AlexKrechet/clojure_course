(ns clojure-train.alloperators)

(def my-map {:y 5})

(defn adding-element []
  (if (< 3 5)
    (assoc my-map :x 3)
    (dissoc my-map :y)))

(def my-list (list 1 2 3 4))

(defn deleting-element []
  (when (contains? my-map :y)
    (conj my-list 5)))

(def my-vector [1 2 3])

(defn case-sense []
  (case 3
    3 (conj my-vector 4)
    4 (conj my-vector 5)
    ))
