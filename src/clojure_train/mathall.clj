(ns clojure-train.mathall)

(defn math-stuff
  []
  (println (+ 1 2 3))
  (println (- 5 3 2))
  (println (* 2 5))
  (println (/ 10 5))
  (println (mod 12 5))

  (println (inc 5))
  (println (dec 5))

  (println (Math/abs -10))
  (println (Math/sqrt 4))
  (println (Math/ceil 3.5))
  (println (Math/floor 3.5))
  (println (Math/max 2 5))
  (println (Math/min 2 5))
  (println (Math/pow 2 2))

  (println (rand-int 20))

  (reduce + [1 2 3])
  )

(defn -main
  [& args]
  (math-stuff)
  )