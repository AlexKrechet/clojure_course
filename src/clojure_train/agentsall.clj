(ns clojure-train.agentsall)

(defn agent-ex []
  (def tickets-sold (agent 0))
  (send tickets-sold + 15)
  (println)
  (println "Tickets " @tickets-sold)

  (send tickets-sold + 10)
  (await-for 100 tickets-sold)
  (println "Tickets " @tickets-sold)
  (shutdown-agents)

  )



(defn -main
  [& args]
  (agent-ex)
  )
