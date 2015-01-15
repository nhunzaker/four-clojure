;; Nth Element
(ns four-clojure.twentyone)

;; Write a function which returns the nth element from a sequence
;; You can not use the nth function!

(defn solution [items slot]
  (if (zero? slot)
    (first items)
    (solution (rest items) (- slot 1))))
