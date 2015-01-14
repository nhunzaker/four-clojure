;; Hello World

(ns four-clojure.sixteen)

;; Write a function which returns a personalized greeting

(def __ #(str "Hello, " % "!"))

(= (__ "Dave") "Hello, Dave!")
(= (__ "Jenn") "Hello, Jenn!")
(= (__ "Rhea") "Hello, Rhea!")
