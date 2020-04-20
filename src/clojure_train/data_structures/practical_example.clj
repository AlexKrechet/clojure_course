(ns clojure-train.data-structures.practical-example)

(def orders
  [{:product "Clock", :customer "Wile Coyote", :qty 6, :total 300}
   {:product "Dynamite", :customer "Wile Coyote", :qty 20, :total 5000}
   {:product "Shotgun", :customer "Elmer Fudd", :qty 2, :total 800}
   {:product "Shells", :customer "Elmer Fudd", :qty 4, :total 100}
   {:product "Hole", :customer "Wile Coyote", :qty 1, :total 1000}
   {:product "Anvil", :customer "Elmer Fudd", :qty 2, :total 300}
   {:product "Anvil", :customer "Wile Coyote", :qty 6, :total 900}
   ])

;;custom reduce-by function, receiving 4 args
(defn reduce-by
  [key-fn f init coll]
  (reduce (fn [summaries x] (let [k (key-fn x)]
              (assoc summaries k (f (summaries k init) x))))
          {} coll)
  )

;;total price of orders for every customer
(reduce-by :customer #(+ %1 (:total %2)) 0 orders)

;;list of customers for each product
(reduce-by :product #(conj %1 (:customer %2)) #{} orders)

(def numbers [1 2 3 4 5])

