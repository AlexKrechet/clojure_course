(ns clojure-train.week2.records)

(def p {:x 1 :y 2})
(:x p)

(deftype PointT [^long x ^long y])
(def p (PointT. 10 10))
(.-x p)

(PointT. 20 (.-y p))

(defrecord PointR [^long x ^long y])
(.-x (PointR. 10 10))

(.-x p)
;;or
(get p :x)
;;or
(assoc p :x 20)
;;or may add an additional field
(assoc p :z 10)
;;get by key
(:z (assoc p :z 10))
;;equals generated automatically for defrecord and not for deftype
(= (PointR. 10 10) (PointR. 10 10))


(defprotocol IFormat
  (format [this]))

(defrecord Cal [d m y]
  IFormat
  (format [this] (str (.-d this) "." (.-m this) "." (.-y this)))
  ;;or (format [_] (str d "." m "." y ))
  java.lang.Comparable
  (compareTo [_ o2]
    (compare
      [y m d]
      [(.-y o2) (.-m o2) (.-d o2)])))
;;or
(.compareTo (Cal. 12 2 2014) (Cal. 16 4 2020))
;;or Clojure style (compare (Cal. 12 2 2014) (Cal. 16 4 2020))



(format (Cal. 16 4 2020))


