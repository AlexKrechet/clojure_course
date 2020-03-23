(ns clojure-train.tutorial
  (:gen-class))

(def simpleLong 15)
(pos? 15)
(neg? 15)
(even? 15)
(odd? 15)
(number? 15)
(number? "15")
(integer? 15)
(double? 15)
(zero? 15)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def aString "Hello")
  (def aDouble 1.234)
  (def aLong 15)
  (format "This is string %s" aString)
  (format "5 spaces and %5d" aLong)
  (format "Leading zeros %04d" aLong)
  (format "%-4d left justified" aLong)
  (format "3 decimals %.3f" aDouble)
  )
