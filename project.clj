(defproject euler-problems "0.1.0-SNAPSHOT"
  :description "A collection of solutions to the famous set of problems done in Clojure"
  :url "http://projecteuler.net"
  :license {:name "GPLv3"
            :url "http://www.gnu.org/licenses/gpl.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot euler-problems.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
