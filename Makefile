.PHONY: clean open

target: node_modules cljs.jar build.clj $(shell find src lib resources node_modules 2>/dev/null)
	rsync -r --del resources/ target/
	java -cp cljs.jar:src clojure.main build.clj

node_modules: package.json
	npm install @cljs-oss/module-deps

open: target
	open target/index.html

cljs.jar: ~/Projects/GitHub/clojurescript/target/cljs.jar
	ln -s ~/Projects/GitHub/clojurescript/target/cljs.jar

clean:
	rm -rf target node_modules
