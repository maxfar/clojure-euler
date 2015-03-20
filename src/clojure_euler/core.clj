(ns clojure-euler.core
  (use clojure-euler.problem-1)
  (:require [clojure.tools.cli :refer [parse-opts]])
  (:gen-class))

(def cli-options
  [["-q" "--question QUESTION" "Project euler questions"
    :default 0
    :parse-fn #(Integer/parseInt %)]])

(defn -main [& args]
  (def euler-problems
    [{:name "Multiples of 3 and 5", :func (problem1)}])

  (def requested-question 
    (get-in (parse-opts args cli-options) [:options :question]))

  (when (< requested-question (count euler-problems))
    (let [name-func (nth euler-problems requested-question)]
      (println (eval (get name-func :name)))
      (println (eval (get name-func :func))))))
