(require 'cljs.build.api)

(cljs.build.api/build
  "src"
  {:main 'hello.core
   :output-to "target/main.js"
   :output-dir "target/main.out"
   :asset-path "main.out"
   :foreign-libs [{:file "es6"
                   :module-type :es6}]
   :install-deps true
   :npm-deps {:unique-random "latest"}})
