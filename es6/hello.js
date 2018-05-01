import random from "unique-random";
export var greet = function(m) {
    document.write("Hello, " + m + random(1, 100)());
};
