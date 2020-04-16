(ns clojure-train.week2.multiMethods)

(def figs [{:type :rect :w 10 :h 20}
           {:type :rect :w 5 :h 6}
           {:type :circle :r 15}
           {:type :circle :r 2}
           {:type :triangle :a 5 :b 6 :c 7}
           {:type :hex :side 12}
           ])

(defn perimeter [fig]
  (case (:type fig)
    :circle (* 2 Math/PI (:r fig))
    :rect (* 2 (+ (:w fig) (:h fig)))))

(defn dispatch [fig] (:type fig))

(defmulti p2 dispatch)

(defmethod p2 :circle [fig]
  (* 2 Math/PI (:r fig)))

(defmethod p2 :rect [fig]
  (* 2 (+ (:w fig) (:h fig))))

(defmethod p2 :triangle [fig]
  (+ (:a fig) (:b fig) (:c fig)))

;;default return for now implementation
(defmethod p2 :default [fig] 0)

(map p2 figs)




