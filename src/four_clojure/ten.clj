(ns four-clojure.ten)

;; Maps store key-value pairs. Both maps and keywords can be used as lookup
;; functions.

(def __ 20)

(= __ ((hash-map :a 10 :b 20 :c 30) :b))

;; Commas can be used to make maps more readable, but they are not required.

(= __ (:b {:a 10, :b 20, :c 30}))
