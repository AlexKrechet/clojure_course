(ns clojure-train.protocols-tutorial
  (:require '[clojure.string :as str])
  (import '[java.util Date]))


(defprotocol ICal
  (day [_])
  (month [_ base-month])
  (year [_]))

(defn format-cal [cal]
  (str (day cal) "." (month cal 1) "." (year cal)))

(extend-type Date
  ICal
  (day [this] (.getDate this))
  (month [this base-month] (+ base-month (.getMonth this)))
  (year [this] (+ 1900 (.getYear this))))

(format-cal (Date.))

(defn create-ical [d m y]
  (reify ICal
    (day [_] d)
    (month [_ b] (+ b m))
    (year [_] y)))

(format-cal (create-ical 14 1 2014))
