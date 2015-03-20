(defproject clojure-euler "0.1.0-SNAPSHOT"
  :description "Project euler problems in clojure"
  :url "https://github.com/maxfar/clojure-euler"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.3.1"]]
  :main ^:skip-aot clojure-euler.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
