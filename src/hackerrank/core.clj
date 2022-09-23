(ns hackerrank.core
  (:gen-class))

(defn fp-list-replication [num lst]
  (flatten
   (reduce
    (fn [frst scnd] (conj frst (repeat num scnd))) [] lst)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (fp-list-replication 3 [1 3 5])))

