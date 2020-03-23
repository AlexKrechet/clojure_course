(ns clojure-train.collectionsasfunctions)

(defn mf []
  (map {:x 1} [:x :y :z])
  )

(defn mfs []
  (filter #{1 2 3} [3 4 5 6])
  )

(defn vf []
  (def v [:a :b :c])
  (get v 2)
  (v 2)
  )

(defn mft []
  (def m {1 "one"
          2 "two"
          3 "three"})
  (map #(get m % "?") [1 2 3 4 3 1])
  ;or (map m) [1 2 3 4 3 1]
  )

(defn sf []
  (def s #{"apple" "banana"})
  (get s "apple")
  (s "apple")
  (remove #(get s %) ["cat" "dog" "banana" "apple"])
  )

(defn mapCreation []
  (def mapOfUsers {
                   1 "George"
                   2 "Michael"
                   3 "Kate"
                   }))

(defn findByNum []
  (get mapOfUsers 2))

(findByNum)

(def users {
                 1 "George"
                 2 "Michael"
                 3 "Kate"
                 })
(defn get-sub []
  (users 3))

(get-sub)

(defn get-users []
  (users 2))

(get-users)