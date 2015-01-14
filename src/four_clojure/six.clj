(ns four-clojure.six)

;; Vectors can be constructed several ways. You can compare them with lists.

(def __ [:a :b :c])

(= __ (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
