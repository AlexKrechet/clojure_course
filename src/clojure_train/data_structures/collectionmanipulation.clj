(ns clojure-train.collectionmanipulation)

;; Collection manipulation

(defn tr []
  (def xs [1 2 3 4 5])
  (map inc xs)
  )

(defn trf []
  (filter odd? xs)
  (filter even? xs))

(defn trr []
  (remove even? xs)
  (println xs))

(defn rdc []
  (reduce + 0 xs))

(defn fr []
  (for [x xs]
    (inc x)))

(defn frc []
  (for [v [[1 2] [3 4]]
        x v
        :let [y (+ 1 x)]
        :when (even? y)
        :while (< y 4)]
    (+ 1 x)))



(defn ran []
  (take 10
        (remove odd?
                (map dec
                     (filter odd?
                             (map inc
                                  (range 100)))))))

(defn redu []
  (reduce (fn [acc el] (+ acc el)) 0 xs))
;; or (reduce + 0 xs)




