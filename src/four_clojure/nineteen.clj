;; Last element

(ns four-clojure.nineteen)

;; Write a function that returns the last element in a sequence.
;; You may not use (last)!

(def __ #(nth % (dec (count %))))

(= (__ [1 2 3 4 5]) 5)
(= (__ '(5 4 3)) 3)
(= (__ ["b" "c" "d"]) "d")
