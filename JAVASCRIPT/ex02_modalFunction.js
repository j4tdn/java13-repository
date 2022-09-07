let isYes = confirm("Were you in primary school?");
if (isYes) {
    let isAgree = confirm("Do you want to play math game?");
    if (isAgree) {
        let a = 10 + Math.round(Math.random() * 91);
        let b = 10 + Math.round(Math.random() * 50);
        let sum = +prompt(`Guess sum of ${a} + ${b}: `, 0);
        if (a + b == sum) {
            alert('Yeeee -> Correct');
        }
        else {
            alert('Oops -> Fail');
        }
    }
}

