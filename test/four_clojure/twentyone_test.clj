(ns four-clojure.twentyone-test
  (:require [clojure.test :refer :all]
            [four-clojure.twentyone :refer :all]))

(deftest with-a-cons-of-ints
  (is (= (solution '(4 5 6 7) 2) 6)))

(deftest with-a-vector-of-keywords
  (is (= (solution [:a :b :c] 0) :a)))

(deftest with-a-vector-of-ints
  (is (= (solution [1 2 3 4] 1) 2)))

(deftest with-a-cons-of-vectors-of-ints
  (is (= (solution '([1 2] [3 4] [5 6]) 2) [5 6])))
