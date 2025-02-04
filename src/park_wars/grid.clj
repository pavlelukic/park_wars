(ns park-wars.grid)

(def grid-size 8)
(defn create-empty-grid []
  (vec (repeat grid-size (vec (repeat grid-size nil)))))

;; (def small-grid-size 6)
;; (def extended-grid-size 10)