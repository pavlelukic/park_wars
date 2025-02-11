(ns park-wars.core
  (:require [park-wars.grid :as grid]
            [park-wars.vehicles :as vehicles]))

(defn -main []
  (println "---- PARK WARS ----")
  (let [empty-grid (grid/create-empty-grid)]
    (println "Grid: ")
    (grid/display-grid empty-grid)
    (println "Vehicles: " (vehicles/vehicles))))
  




