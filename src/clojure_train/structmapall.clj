(ns clojure-train.structmapall)

(defn struct-map-example
  []
  (defstruct Customer :Name :Phone)
  (def cust1 (struct Customer "Doug" "412212212"))

  (def cust2 (struct-map Customer :Name "Sally"
                                  :Phone 515515515))
  (println cust1)
  (println (:Name cust2))
  (println (:Name cust1))
  )

(defn -main
  [& args]
  (struct-map-example)
  )
