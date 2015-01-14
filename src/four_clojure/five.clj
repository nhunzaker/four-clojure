(ns four-clojure.five)

;; When operating on a list, the conj function will return a new list
;; with one or more items "added" to the front.

(def __ (list 1 2 3 4))

(= __ (conj '(2 3 4) 1))
(= __ (conj '(3 4) 2 1))
