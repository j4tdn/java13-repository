let numbers = [5, 88, 26, 44, 17];

function odd(num) {
    return num % 2 !== 0;
}
function printNumber(numbers, condition) {
    for (let number of numbers) {
        if (condition(number)) {
            console.log(number);
        }
    }
}
// Print all odd numbers
printNumber(numbers, odd);
// Print all even numbers
printNumber(numbers, num => num % 2 === 0);