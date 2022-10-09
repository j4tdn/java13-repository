Array.prototype.add = function(index, element){
	this.splice(index, 0, element);
};


let numbers = [2, 6, 1, 8];

numbers.push(55);
numbers.unshift(11);
numbers.add(3, 33);

console.log(numbers);
console.log(numbers.filter(nbr => nbr % 2 === 0));
