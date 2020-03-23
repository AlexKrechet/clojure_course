(ns clojure-train.looping)

(defn one-to-x
  [x]
  (def i (atom 1))
  (while (<= @i x)
    (do
      (println @i)
      (swap! i inc))))

(defn dbl-to-ex
  [x]
  (dotimes [i x]
    (println (* i 2))
    ))

(defn triple-to-x
  [x y]
  (loop [i x]
    (when (< i y)
      (println (* i 3))
      (recur (+ i 1)))))

(defn print-list
  [& nums]
  (doseq [x nums]
    (println x)
    ))

(def mylist (list 1 2 3 4))

(defn -main
  [& args]
  (one-to-x 5)
  (dbl-to-ex 5)
  (triple-to-x 1 5)
  (print-list mylist)
  (countdown 5)
  )

(defn countdown
  [x]
  (if (zero? x)
    :blastoff!
    (do (println x)
        (recur (dec x)))))


