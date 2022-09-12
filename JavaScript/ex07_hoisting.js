/* 

Hoisting works/scan with
  + Variable declaration
  + Function declaration

*/

"use strict"; // require declare before using
// var --> window : global object
console.log("age before " + age); // undefined
var age = 22;
// console.log("age after " + age);

// VA
// function getCurrentYear()
// function calAge(yob)
console.log("FD Before: " + calAge(1980));
function getCurrentYear() {
	return new Date().getFullYear();
}
function calAge(yob) {
	return getCurrentYear() - yob + 1;
}
console.log("FD After: " + calAge(1980));

// var calculateAge
console.log("FE Before: " + calculateAge(1980));
var calculateAge = function(yob) {
	return getCurrentYear() - yob + 1;
}
console.log("FE After: " + calculateAge(1980));


