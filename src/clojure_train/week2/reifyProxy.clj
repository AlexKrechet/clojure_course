(ns clojure-train.week2.reifyProxy
  (:import (java.util Collections Comparator TimerTask)))

(import '[java.util ArrayList Collections Comparator Timer TimerTask])

(.start (Thread. #(println "abc")))

(let [arr (ArrayList. [3 4 1 2])
      comp (reify Comparator
             (compare [this a b]
               (- b a)))]
  ;;desc or "(- a b)" for asc order
  (Collections/sort arr comp)
  arr)


;;(proxy [SuperClass Ifaces ...] [constructor-args])
;;(method [args] ...)

(let [task (proxy [TimerTask] []
             (run []
               (println (rand))))]
  (.schedule (Timer.) task 1000)
  )




