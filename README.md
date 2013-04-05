# lein-lazytest

Leiningen plugin for Stuart Sierra's lazytest (https://github.com/stuartsierra/lazytest).

## Installation 

Clojars:

```clojure
:plugins [[eightnotrump/lein-lazytest "1.0.5"]]
```

## Usage

```shell
lein lazytest
```

Use ```:lazytest-path [...paths...]``` in project.clj to add paths
(defaults are "src", "test").

## License

Copyright (C) 2013 Mike Thvedt, Steen Larsen (https://github.com/surt666), other contributors 

Distributed under the Eclipse Public License, the same as Clojure.
