(ns hackerrank.core
  (:gen-class))

(defn fp-list-replication [num lst]
  (flatten
   (reduce
    (fn [frst scnd] (conj frst (repeat num scnd))) [] lst)))

(defn fp-filter-array [delim lst]
  (for 
    [i lst :when (> delim i)] 
    i))

(defn fp-filter-positions-in-a-list [lst]
   (take-nth 2 (drop 1 lst)))

(defn fp-reverse-a-list [lst]
   (flatten 
   (remove nil?
    [(last lst)
    (if (empty? lst)
      []
      (fp-reverse-a-list (drop-last lst)))])
      ))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (fp-reverse-a-list [0 1 2 3 4 5 6 7 8 9])))

;; (defn old-tests
  ;; (println (fp-filter-positions-in-a-list [0 1 2 3 4 5 6 7 8 9]))
  ;; (println (fp-filter-array 3 [1 2 3 4 5]))
  ;; (println (fp-list-replication 3 [1 3 5])))
