(ns clojure-euler.problem-2)

(defn problem2 
  []
  (def fib
    ((fn rfib [a b]
       (lazy-seq (cons a (rfib b (+ a b)))))
     0 1))

  (reduce + (filter even? (take-while (partial > 4000000) fib))))
