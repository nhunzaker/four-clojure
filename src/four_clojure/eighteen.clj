;; Sequences: filter

(ns four-clojure.eighteen)

;; The filter function takes a predicate function and a sequence. It returns
;; a new sequence consisting of all the f(s) which return true

(def __ [6 7])

(= __ (filter #(> % 5) '(3 4 5 6 7)))
