// ES5 --> var: function scope

function modal(isSave) {
   if (isSave) {
      var firstName = "Susan";
      var yearOfBirth = 1990;	
   }
   var currentYear = new Date().getFullYear();
   console.log(`Save Modal info --> ${firstName} is ${currentYear - yearOfBirth} years old`);
}

modal(true);

// ES6 --> let: block scope
function modal(isEdit) {
   if (isEdit) {
      let firstName = "Titan";
      let yearOfBirth = 1992;	
      let currentYear = new Date().getFullYear();
   	  console.log(`Edit Modal info --> ${firstName} is ${currentYear - yearOfBirth} years old`);
   }
   
}
modal(true);

const value = 99;
// value = 22;
console.log(value);