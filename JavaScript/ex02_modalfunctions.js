/*
   Basic Modal functions: alert, confirm, prompt
   alert  : void     --> print text
   confirm: boolean  --> yes/no question
   prompt : string   --> text question

   Pseudo code
   Question: Were you in primary school ?
      A. YES
         Do You want to play math game ?
         A. YES
            Random A, B
            Enter sum of A and B ...
            Condition: A + B = Result --> Correct
                                      --> Fail
         B. NO
      B. NO
*/

let wasInPrimary = confirm('Were you in primary school ?');
if (wasInPrimary) {
	let agreedToPlay = confirm('Do You want to play math game ?');
	if (agreedToPlay) {
		// a & b in [10, 100]
		let a = 10 + Math.round(Math.random() * 91);
		let b = 10 + Math.round(Math.random() * 91);
		let c = +prompt(`Guess sum of ${a} and ${b} ...`, 0);
	    if (a + b === c) {
	    	alert('Yeeee ---> Correct');
	    } else {
	    	alert('Oops ---> Fail');
	    }
	}
}