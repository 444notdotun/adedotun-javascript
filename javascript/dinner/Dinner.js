

/* 
let number = parseInt(prompt("enter a number for factorial: "));
let count = number;
let factorial = 1;
while (count > 0) {
    factorial *= count;
    count -= 1;
}
console.log("factorial is " + factorial);
console.log();
console.log();
console.log();

let firstNumber = parse(prompt("enter number1 for factorial: "));
let secondNumber = parseI(prompt("enter number2 for factorial: "));
let smallest = firstNumber;
if (secondNumber < smallest) {
    let divison = 1;
    smallest = secondNumber;
    while (divison != 0) {
        divison = firstNumber % smallest;
        if (divison == 0) {
            console.log("GCD " + smallest);
        } else {
            firstNumber = smallest;
            smallest = divison;
        }
    }
} else {
    let divison = 1;
    while (divison != 0) {
        divison = secondNumber % smallest;
        if (divison == 0) {
            console.log("GCD " + smallest);
        } else {
            secondNumber = smallest;
            smallest = divison;
        }
    }
}

let firstNumber = parseI(prompt("enter number1: "));
let secondNumber = parse(prompt("enter number2: "));
let count = 2;
while (count > 0) {
    let smallest = secondNumber;
    if (firstNumber < smallest) {
        smallest = firstNumber;
        let divison = smallest * count;
        if (divison % smallest == 0) {
            let firstdivison = secondNumber * count;
            if (firstdivison % secondNumber == 0) {
                console.log("lcm is " + firstdivison);
                break;
            } else {
                count++;
            }
        } else {
            count++;
        }
    } else {
        let divison = smallest * count;
        if (divison % smallest == 0) {
            let firstdivison = firstNumber * count;
            if (firstdivison % firstNumber == 0) {
                console.log("lcm is " + firstdivison);
                break;
            } else {
                count++;
            }
        } else {
            count++;
        }
    }
}

let sum = 0;
let number = 6;
for (let count = 1; count < 6; count++) {
    if (number % count == 0) {
        sum += count;
    }
}
if (sum == number) {
    console.log("it is a perfect number");
} else {
    console.log("not a perfect number");
}

let moduled = 0;
let tempnumber = 153;
let modsum = 1;
let count = 1;
let sum = 0;
let countnumber = tempnumber;
let counter = 0;
while (countnumber > 0) {
    countnumber = Math.floor(countnumber / 10);
    counter++;
}
let newnumber = tempnumber;
while (newnumber > 0) {
    moduled = newnumber % 10;
    while (count <= counter) {
        modsum *= moduled;
        count++;
    }
    sum += modsum;
    modsum = 1;
    count = 1;
    newnumber = Math.floor(newnumber / 10);
}
if (sum == tempnumber) {
    console.log(tempnumber" is an armstrong number`);
} else {
    console.log(tempnumber" is not an armstrong number`);
}

let tempnumber = 1;
while (tempnumber <= 1000) {
    let countnumber = tempnumber;
    let counter = 0;
    let sum = 0;
    while (countnumber > 0) {
        countnumber = Math.floor(countnumber / 10);
        counter++;
    }
    let newnumber = tempnumber;
    let count = 1;
    while (newnumber > 0) {
        let moduled = newnumber % 10;
        let modsum = 1;
        while (count <= counter) {
            modsum *= moduled;
            count++;
        }
        sum += modsum;
        count = 1;
        newnumber = Math.floor(newnumber / 10);
    }
    if (sum == tempnumber) {
        console.log(tempnumber + " is an armstrong");
    }
    tempnumber++;
}

let number = 1;
while (number < 1000) {
    let sum = 0;
    for (let count = 1; count < number; count++) {
        if (number % count == 0) {
            sum += count;
        }
    }
    if (sum == number) {
        console.log(number + " it is a perfect number");
    }
    number++;
}

let sum = 0;
let count = 40585;
let number = count;
let counter = 0;
while (count > 0) {
    counter = count % 10;
    let factorial = 1;
    while (counter > 0) {
        factorial *= counter;
        counter--;
    }
    sum += factorial;
    count = Math.floor(count / 10);
}
if (sum == number) {
    console.log(number + " is a strong number");
}

let year = 1900;
while (year <= 2025) {
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                console.log(year);
            }
        }
        console.log(year);
    }
    year++;
}
*/

let count = 0;
let year = 1900;
while (year <= 2025) {
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                count++;
            }
        }
        count++;
    }
    year++;
}
console.log(count);
