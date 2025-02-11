(ns park-wars.grid)

(def grid-size 8)

(defn create-empty-grid []
  (vec (repeat grid-size (vec (repeat grid-size nil)))))

;; (def small-grid-size 6)
;; (def extended-grid-size 10)

(defn display-grid
  "Prints out the grid-size x grid-size grid."
  [grid]
  (println "   A B C D E F G H")
  (doseq [i (range grid-size)]
          (print (str (inc i) " "))
                 (doseq [j (range grid-size)]
                         (print (or (get-in grid [i j]) " "))
                   (println)))
)