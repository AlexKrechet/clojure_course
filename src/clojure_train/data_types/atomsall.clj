(ns clojure-train.atomsall)

(defn atom-ex
  [x]

  (def atomEx (atom x))
  (add-watch atomEx :watcher
       (fn [key atom old-state new-state]
         (println "atomEx changed from "
                  old-state " to " new-state)))
  (println "1st x" @atomEx)
  (reset! atomEx 10)
  (println "2nd x" @atomEx)
  (swap! atomEx inc)
  (println "Increment x" @atomEx)
  )

(defn -main
  [& args]
  (atom-ex 5)
  )
