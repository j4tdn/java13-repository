/*
   JS Functions

	- Function declaration
     function name(){};
     function name(arg1, arg2, ...){};

   - Function expression
     let name = function(){};
     let name = function(arg1, arg2, ...){}; 
     let name = () => {}
     let name = (arg1, arg2, ...) => {}

   -- Everything in JS is object  

*/

function printf(prefix, input) {
	console.log(`${prefix} --> ${input}`);
}

function printf(input) {
	console.log(`${input}`);
}

function randInt(inital, bound) {
	return inital + Math.round(Math.random() * (bound-inital));
}

function sum(st, nd) {
	return st + nd;
}

let a = randInt(10, 100);
let b = randInt(10, 20);

printf('a', a);
printf('b', b);

printf(`sum of ${a} and ${b} = ${a+b}`);

/*
   JS Callback Functions

   --> print out odd, even, prime elements
*/

printf('-----------callback functions-----------');

let numbers = [5, 88, 26, 44, 17];

function printElements(elements, test) {
	for(let nb of numbers) {
		if (test(nb)) {
           printf(nb);
		}
	}
}

function isOdd(number) {
	return number % 2 !== 0;
}

// isOdd is callback function
printElements(numbers, isOdd);

// isEven is optional --> anonymous function
printElements(numbers, function(number) {
	return number % 2 === 0;
});

printf('-----------expression functions-----------');
// let isEven = function(number) {
let isEven = (number) => {
	return number % 2 === 0;
}
// isOdd is callback function
printElements(numbers, isEven);