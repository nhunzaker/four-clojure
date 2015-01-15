;; Count a sequence
(ns four-clojure.twentytwo)

;; Write a function which returns the total number of elements in a sequence
;; You can not use count!

(defn solution [items]
  (reduce + (map (fn [x] 1) items)))
