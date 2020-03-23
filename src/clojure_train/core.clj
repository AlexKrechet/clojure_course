(ns clojure-train.core)

(defn foo
  "I dont't do a whole lot."
  [x]
  (println x "Hello, world!"))

(defn myfunc []
  (let [a (+ 1 2)]
    (println a)))

(defn f [x]
  (inc x))

(let [g (fn [x] (inc x))]
  (g 2))

(defn frs [x & xs]
  xs)

#(str %1 %&)

#(+ %1 %2)

(defn- frs2 ^{:pre [(pos? x)]
              :post [(< % 20) (> % 10)]}
  [x]
  (* 2 x))

(defn myfunc2 []
  (loop [x 10
         acc 0]
         (if (pos? x)
         (do
         (println "x:" x "acc:" acc)
         (recur (- x 1) (+ acc x)))
         acc)))

(defn fibonacci []
  (let [N 7]
    (loop [i 0
           fib-i-1 0
           fib-i 1]
      (if (= i N)
        fib-i
        (recur (inc i) fib-i (+ fib-i-1 fib-i))
        )
      )
    )
  )

;(-
; (+ -1 (* 2 x))
; (* (- a b) (- x y)))

;(if <test> <then> <else>)
;(if (< 1 2)
;5
;6)

;(when <test> <then>)
;(when (< 1 2)
; 5)

;(case "v1"
; "v1" true
; "v2" false
; 42)

;(cond
; (> x 10) :left
; (< x 10) :right
; :else :down

;(and true false)
;(or true false)

;(or x y z t)
;(or nil nil 7 12) will return 7

;(and 77 88) will return last true value - 88
;(and 77 nil) wil return false

;(do
; 1
; (println "123")
; 3)              - will return the last one, in this case 3

;(if true
;(do
;(println "123")
;(+ 1 2 3))
; :no)

;(when true
;(println "123")
;(+ 1 2 3))
; :no)

;(let [x 10]
;(+ x 2)) - value exists only inside

;(loop [x 10]
; (if (pos? x)
;(recur (- x 1))
;x))

;(loop [x 10
; acc 0]
; (if (pos? x)
;(do
;(println x acc)
;(recur (- x 1) (+ acc x)))
;acc))

;(let [g (fn1 [x] (inc x))]
;  (g 2))
;
;#(inc %) the same as  (fn1 [x] (inc x))
;#(+ %1 %2) the same as (fn1 [x y] (+ x y))
;#(str %1 %&) the same as (fn [x & xs])

;xs
;(+ [1 2 3])
;(apply + 1 2 3 4 xs)

;(defn g [x y z] (+ x y z))
;(fn [z] (g 1 2 z))
;((partial g 1 2 3))

;(identity 7)
;((constantly 7) 12 13 14)

;xs [1 2 3 4]
;(map dec xs) - previous number 0 1 2 3
;(map identity xs) - the same numbers 1 2 3 4
;(map inc xs) - next number 2 3 4 5

;xs [1 2 3 4 5]
;(map (juxt dec identity inc) xs) - will return array of results of all functions




