(ns cljside.core)

(defrecord Dontwork [a])

;; Note that the gen-class must come here, rather than in the ns declaration
;; as it references Dontwork
(gen-class
 :main false
 :name "cljside.MyClass"
 :methods [^:static [makeDontwork [String] cljside.core.Dontwork]])

(defn -makeDontwork
  [in-a]
  (map->Dontwork {:a in-a}))
