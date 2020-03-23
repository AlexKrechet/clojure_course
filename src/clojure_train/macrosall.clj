(ns clojure-train.macrosall)

(defmacro discount
  ([cond dis1 dis2]
   (list 'if cond dis1 dis2))
  )

(defmacro reg-math
  [calc]
  (list (second calc) (first calc)
        (nth calc 2)))

(defmacro do-more
  [cond & body]
  (list `if cond (cons 'do body)))

(defmacro do-more-2
  [cond & body]
  `(if ~cond (do ~@body))
  )

(defn -main
  [& args]
  (discount (> 25 65)
            (println "10% off")
            (println "Full Price"))
  (reg-math (2 + 5))
  (do-more (< 1 2) (println "Hello")
           (println "Hello Again"))
  (do-more-2 (< 1 2) (println "Hello")
           (println "Hello Again"))

  )
