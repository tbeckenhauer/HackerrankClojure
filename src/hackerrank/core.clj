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

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  )

(defn old-tests
  (println (fp-filter-array 3 [1 2 3 4 5]))
  (println (fp-list-replication 3 [1 3 5])))
