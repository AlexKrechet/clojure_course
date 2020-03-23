(ns clojure-train.bindingsss)

(def ^:dynamic *log* false)

(binding [*log* 77]
  *log*)

()