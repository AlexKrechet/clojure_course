(ns clojure-train.functionsbasics)


(defn say-hello
  "Receive a name ith 1 parameter and responds"
  [name]
  (println "Hello again" name)
  )

(defn get-sum
  [x y]
  (+ x y)
  )

(defn get-sum-more
  ([x y z]
   (+ x y z))

  ([x y]
   (+ x y)))

(defn hello-you
  [name]
  (str "Hello " name)
  )

(defn hello-all
  [& names]
  (map hello-you names)
  )

(defn -main
  [& args]
  (say-hello "Derek")
  (get-sum 4 5)
  (get-sum-more 1 2 3)
  (hello-all "Doug" "Marry" "Paul")

  )
