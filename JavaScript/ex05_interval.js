/*
let counter = 0;
// repeat one time
setTimeout(function() {
	console.log('timeout --> ' + counter++);
}, 1000);


// repeat n times
// finish after clear interval
let runner = setInterval(function() {
	if (counter === 8) {
		clearInterval(runner);
	}
	console.log('interval --> ' + counter++);
}, 1000);
*/
let counter = 10;
let runningSelector = document.querySelector("#running")
runningSelector.textContent = counter;

let runner = setInterval(function() {
	counter--;
	runningSelector.textContent = counter;
	if (counter === 0) {
		window.location.href = "index.html";
		clearInterval(runner);
	}
	
}, 1000)