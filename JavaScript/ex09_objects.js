let person = {
	name: 'John',
	age: '20',
	job: 'Testing',

	showSkills: function() {
		console.log('Manual, Automation, Manage');
	}
};

console.log(person.name);
person.showSkills();

// ES5
let People = function(name, yob, job) {
	this.name = name;
	this.yob = yob;
	this.job = job;

	this.showInfo = function() {
		let age = new Date().getFullYear() - this.yob;
		console.log(`${this.name} is ${age} years ago.`);
	}
}
People.prototype.printJob = function() {
	console.log(`${this.name} is working as a ${this.job}`);
}
let adam = new People('Adam', 2000, 'BE dev');
adam.showInfo();
adam.printJob();

// ES6
class Human {
	constructor(name, yob, job) {
		this.name = name;
		this.yob = yob;
		this.job = job;
	}

	showInfo() {
		let age = new Date().getFullYear() - this.yob;
		console.log(`${this.name} is ${age} years ago.`);
	}
}
let marry = new People('Marry', 1990, 'FE dev');
marry.showInfo();