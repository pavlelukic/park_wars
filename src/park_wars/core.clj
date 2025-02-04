(ns park-wars.core
  (:require [park-wars.grid :as grid]
            [park-wars.vehicles :as vehicles]))

(defn -main []
  (println "---- PARK WARS ----")
  (println "Empty grid: " (grid/create-empty-grid))
  (println "Vehicles: " (vehicles/vehicles)))
