(ns clojure-train.anonymousfunctions)

(map #(* % 3) (range 1 10))

(#(* %1 %2) 2 3)

(defn custom-multiplier
  [mult-by]
  #(* % mult-by)
  )

(def mult-by-3
  (custom-multiplier 3))

(defn -main
  [& args]
  )