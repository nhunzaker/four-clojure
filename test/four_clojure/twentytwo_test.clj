(ns four-clojure.twentytwo-test
  (:require [clojure.test :refer :all]
            [four-clojure.twentytwo :refer :all]))

(deftest one
  (is (= (solution '(1 2 3 3 1)) 5)))

(deftest two
  (is (= (solution "Hello World") 11)))

(deftest three
  (is (= (solution [[1 2] [3 4] [5 6]]) 3)))

(deftest four
  (is (= (solution '(13)) 1)))

(deftest five
  (is (= (solution '(:a :b :c)) 3)))
