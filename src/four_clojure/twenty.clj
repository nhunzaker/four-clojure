;; Penultimate Element

(ns four-clojure.twenty)

;; Write a function which returns the second to last element from a sequence

(def __ #(nth % (- (count %) 2)))

(= (__ (list 1 2 3 4 5)) 4)
(= (__ ["a" "b" "c"]) "b")
(= (__ [[1 2] [3 4]]) [1 2])
