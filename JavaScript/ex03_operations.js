/*
   IF ELSE - SWITCH CASE
   WHILE, DO WHILE
   FOR -->
*/

let numbers = [6, 3, 22, 78, 49];

let length = numbers.length;

console.log('length: ' + length);

for (let i = 0; i < length; i++) {
	console.log('--> ' + numbers[i]);
}

// for-index
for (let i in numbers) {
	console.log('i --> ' + i);
}

// for-each
for (let nb of numbers) {
	console.log('nb --> ' + nb);
}