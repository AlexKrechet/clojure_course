(ns clojure-train.destructuringof)

(defn f [x]
  [:ok (* 2 x) (pos? x)])

(f 1)

(let [res (f -1)
      success? (first res)
      val (get res 1)
      pos? (get res 2)]
  [success? val pos?])

;;or
(let [[success? val pos?] (f-1)]
  [success? val pos?])

;;example
(defn f [x & {:as opts}]
  opts)

(f 1 :flag true
   :debug false
   :indent 11)
