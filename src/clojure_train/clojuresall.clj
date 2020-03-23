(ns clojure-train.clojuresall)


(defn take-two-first
  []
  (take 2 [1 2 3 4]))

(defn drop-one-first
  []
  (drop 1 [1 2 3 4]))

(defn take-negative
  []
  (take-while neg? [-1 0 1]))

(defn filter-my-vector
  []
  (filter #(> % 2) [1 2 3 4]))



(defn -main
  [& args]
  (take-two-first)
  (drop-one-first)
  (take-negative)
  (filter-my-vector)
  )
