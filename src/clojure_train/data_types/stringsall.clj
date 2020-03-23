(ns clojure-train.stringsall
  (:require [clojure.string :as str]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def str1 "This is my 2nd string")
  (str/blank? str1)
  (str/includes? str1 "my")
  (str/index-of str1 "my")
  (str/split str1 #" ")
  (str/split str1 #"\d")
  (str/join " " ["The" "Big" "Cheese"])
  (str/replace "I am 42" #"42" "43")
  (str/trimr str1)
  (str/upper-case str1)
  )