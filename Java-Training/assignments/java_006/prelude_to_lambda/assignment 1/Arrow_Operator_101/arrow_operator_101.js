

console.log("Basic Syntax with one parameter");
//ES5
var phraseSplitterEs5 = function phraseSplitter(phrase) {
  return phrase.split(' ');
};

//ES6
const phraseSplitterEs6 = phrase => phrase.split(" ");

console.log(phraseSplitterEs6("ES6 Awesomeness"));  // ["ES6", "Awesomeness"]



console.log("Basic syntax with multiple parameters");
// (param1, param2, paramN) => expression

// ES5
var multiplyES5 = function(x, y) {
  return x * y;
};

console.log(multiplyES5);
// ES6
const multiplyES6 = (x, y) => { return x * y };

console.log(multiplyES6);


console.log("Basic Syntax with no parameters");
//ES5
var docLogEs5 = function docLog() {
    console.log(document);
};
//ES6
var docLogEs6 = () => { console.log(document); };
docLogEs6(); // #document... <html> ….


console.log("Object Literal Syntax");
//ES5
var setNameIdsEs5 = function setNameIds(id, name) {
  return {
    id: id,
    name: name
  };
};

console.log(setNameIdsEs5);

// ES6
var setNameIdsEs6 = (id, name) => ({ id: id, name: name });

console.log(setNameIdsEs6 (4, "Kyle"));   // Object {id: 4, name: "Kyle"}
