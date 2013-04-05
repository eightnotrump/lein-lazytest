(ns leiningen.lazytest
  (:require [leiningen.core.eval :as eval]))

(defn lazytest "Runs lazytest watch on paths supplied in :lazytest-path [\"src\" \"test\"]"  [project]
  (eval/eval-in-project
   project      
   `(do        
      (require 'lazytest.watch)       
      (lazytest.watch/start ~(get project :lazytest-path ["src" "test"])))))
