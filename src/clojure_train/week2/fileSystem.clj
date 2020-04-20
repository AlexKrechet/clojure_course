(ns clojure-train.week2.fileSystem
  (:require [clojure.java.io :as io]))

(require '[clojure.java.io :as io])

(spit "file.txt" [:a 1])
(slurp "file.txt")
;; works with URLs, Reader, Socket as well

*in*
*out*
*err*

(with-open [wr (io/writer "file.txt")]
  ;;creates buffered ^ writer
  (binding [*out* wr]
    (print "Hello world")
    (flush)))

(slurp "file.txt")

;;or

(with-out-str
  ;;string buffer
  (print "Hello world")
  (flush))

(slurp "file.txt")

(with-open [rd (io/reader "file.txt")]
  (vec
    (for [line (line-seq rd)]
      line)))

(io/as-file "file.txt")
(file-seq (io/as-file "."))
(io/resource "log4j.properties")