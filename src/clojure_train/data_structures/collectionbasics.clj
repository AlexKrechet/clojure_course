(ns clojure-train.collectionbasics)
;; List
(def l (list 1 2 3 4))


(defn lp []
  (println l)
  (conj l 4 5 6)
  (println l)
  (nth l 2 :default))

;; Vector
(def v [1 2 3 4])

(defn vp []
  (println v)
  (conj v 5 6)
  (println v)
  (nth v 3)
  (get v 10 :default))

;; Map
(def m {:x 1 [1 2 3] 2})
(sorted-map "y" 1 "x" 2)

(defn ml []
  (println m)
  (assoc m :z 3)
  (println m)
  (dissoc m [1 2 3])
  (contains? m :z)
  (get m :z :def))

;; Set

(defn sp []
  (def s #{1 2 3})
  (println s)
  (conj s 2)
  (contains? s 2)
  (get s :x))

;;(clojure.set/union #{1 2 3} #{3 4 5})
;;(clojure.set/difference #{1 2 3} #{3 4 5})


;; Equality

(defn ep []
  (= [1 2 3] '[1 2 3])
  (= #{[1 2]} #{'(1 4)}))

;; Immutability

