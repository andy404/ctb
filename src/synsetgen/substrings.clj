(ns synsetgen.substrings
  (:require [clojure.string :refer [split join]]))

(defn generate-ordered-subsets
  [instr]
  (let [tokens (split instr #" ")
        n (dec (count tokens))]
    (map (fn [pos]
           (join " " (vector (nth tokens pos)
                             (nth tokens (inc pos)))))
           (range n))))
