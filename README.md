```
$ make
rsync -r --del resources/ target/
java -cp cljs.jar:src clojure.main build.clj
WARNING: JavaScript file found on classpath for library `hello.es-module`, but does not contain a corresponding `goog.provide` declaration: file:/usr/src/hello/es_module.js
$ cat target/main.out/hello/core.js
// Compiled by ClojureScript 1.9.1032 {}
goog.provide('hello.core');
goog.require('cljs.core');
goog.require('module$usr$src$hello$es_module');
module$usr$src$hello$es_module.greet("test");

//# sourceMappingURL=core.js.map
$ cat target/main.out/src/hello/es_module.js
goog.provide("module$usr$src$hello$es_module");goog.require("hello.say");var greet$$module$usr$src$hello$es_module=function(m){document.write(hello.say.it(m))};module$usr$src$hello$es_module.greet=greet$$module$usr$src$hello$es_module
$ cat target/main.out/hello/say.js
// Compiled by ClojureScript 1.9.1032 {}
goog.provide('hello.say');
goog.require('cljs.core');
hello.say.it = (function hello$say$it(m){
return ["Hello, ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(m)].join('');
});
goog.exportSymbol('hello.say.it', hello.say.it);

//# sourceMappingURL=say.js.map
```

```
$ make
rsync -r --del resources/ target/
java -cp cljs.jar:src clojure.main build.clj
WARNING: JavaScript file found on classpath for library `hello.es-module`, but does not contain a corresponding `goog.provide` declaration: file:/usr/src/hello/es_module.js
$ cat target/main.out/hello/core.js
// Compiled by ClojureScript 1.9.1033 {}
goog.provide('hello.core');
goog.require('cljs.core');
goog.require('module$usr$src$hello$es_module');
module$usr$src$hello$es_module.greet("test");

//# sourceMappingURL=core.js.map
$ cat target/main.out/src/hello/es_module.js
goog.provide("module$usr$src$hello$es_module");
goog.require("goog");
goog.require("hello.say");
goog.require("hello.say");var greet$$module$usr$src$hello$es_module=function(m){document.write(hello.say.it(m))};var module$usr$src$hello$es_module={};module$usr$src$hello$es_module.greet=greet$$module$usr$src$hello$es_module
$ cat target/main.out/hello/say.js
// Compiled by ClojureScript 1.9.1033 {}
goog.provide('hello.say');
goog.require('cljs.core');
hello.say.it = (function hello$say$it(m){
return ["Hello, ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(m)].join('');
});
goog.exportSymbol('hello.say.it', hello.say.it);

//# sourceMappingURL=say.js.map
```
