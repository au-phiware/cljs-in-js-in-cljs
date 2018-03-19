(require 'cljs.build.api)

(cljs.build.api/build
  "src"
  {:main 'hello.core
   :output-to "target/main.js"
   :output-dir "target/main.out"
   :asset-path "main.out"
   ;:optimizations :simple
   :foreign-libs [{:file "src"
                   :module-type :es6}]})
