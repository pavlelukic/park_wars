(defproject park_wars "0.1.0-SNAPSHOT"
  :description "A two player turn-based parking strategy game." 
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main park-wars.core)

(def grid-size 8)
(def empty-grid (vec (repeat grid-size (vec (repeat grid-size nil)))))

;; (def small-grid-size 6)
;; (def extended-grid-size 10)

(def vehicles
  {:motorcycle {:size [1 1] :points 1}
   :car {:size [2 1] :points 2}
   :limo {:size [3 1] :points 3}
   :bus {:size [4 1] :points 4}})

