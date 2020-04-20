(ns clojure-train.week2.javaCodeInvocation)

(import '[java.io File])

(File. "." "calling_java.clj")
;;or (new File "." "calling_java.clj") will be the same
;;as well as (java.io.File. "." "calling_java.clj")

(.toUpperCase "abc")

(Math/sqrt 25)

Math/PI

(.-a x)
;;where "a" is a field

(deftype Struct [a b c])
;;object structure designated
(.-a (Struct. 1 2 3))
;;object creation and access to "a" field



(doto (java.util.HashMap.)
  (.put "a" 1)
  (.put "b" 2))
;; doto is a macros for a mutable objects

(doto (Thread. #(println "abc"))
  (.start))