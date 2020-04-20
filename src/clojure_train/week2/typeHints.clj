(ns clojure-train.week2.typeHints)

(set! *warn-on-reflection* true)

(defn ^Integer strlen [^String s]
  (.length s))

(.intValue (strlen "123"))

(def ^String x "abc")

(StringBuilder. x)

^Classname
^long
^int
^short
^byte

^longs ;; long[]
^ints ;; int[]

(defrecord R [^long a ^byte b])
