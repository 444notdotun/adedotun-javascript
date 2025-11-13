


let name = "adedotun";
let total = ["a","d","e","d","o","t","u","n"];
for(let count = name.length-1; count >= 0; count--){
    process.stdout.write(total[count]);
}
console.log();
console.log();
console.log();

let numbers = 12345;
let sum = [1,2,3,4,5];
for(let count = 4; count >= 0; count--){
    process.stdout.write(sum[count].toString());
}
console.log();
console.log();
console.log();

let vowels = "aeiou";
let letters = "adedotun";
let vowelcount = 0;
for(let count = 0; count < letters.length; count++){
    let newvowel = ' ';
    let newletters = letters[count];
    for(let counting = 0; counting < vowels.length ;counting++){
        newvowel = vowels[counting];
        if(newletters.toLowerCase()==newvowel){
            vowelcount++;
            break;
        }
    }
    if(newletters.toLowerCase()==newvowel){
        break;
    }
}
console.log("vowelcount "+ vowelcount);

console.log();
console.log();
console.log();

let average = 0;
let ofSum = 0;
for (let count =1 ; count <= 100; count++){
    ofSum+=count;
    average = Math.floor(ofSum/100);
}
console.log("average is " + average);

console.log();
console.log();
console.log();

let givenNumber = 50;
ofSum = 0;
for (let count =2 ; count < givenNumber; count++){
    if (givenNumber%count == 0){
        console.log(count);
    }
}

console.log();
console.log();
console.log();

givenNumber = 50;
ofSum = 0;
let counter = 0;
for (let count =2 ; count < givenNumber; count++){
    if (givenNumber%count == 0){
        counter++;
    }
}
console.log(counter);

/* 
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
letters = "adedotun";
for(int count = 0; count < letters.length();count++){
    char newletter = letters.charAt(count);
    System.out.print( newletter + " is " + char newletter);
}
*/

console.log();
console.log();
console.log();

let new_number = 11211;
let last_numbers = 0;
let first_numbers = 0;
let last_num1 = 0;
let last_num2 = 0;
let first_num1 = 0;
let first_num2 = 0;
last_numbers = new_number % 100;
first_numbers = Math.floor(new_number / 1000);
last_num1 = last_numbers % 10;
last_num2 = Math.floor(last_numbers / 10);
first_num1 = first_numbers % 10;
first_num2 = Math.floor(first_numbers / 10);
if (last_num1 == first_num2 && last_num2 == first_num1){
    console.log("it is a palindrome");
}else{
    console.log("it is not a palindrome");
}

/* 
char letter = ' ';
String number = "adedade";
for(int count = 0;count < number.length();count++){
    letter = number.charAt(count);
}
if(letter== number){
    System.out.print("its a palindrome");
} else{
    System.out.print("its not a palindrome");}
*/

console.log();
console.log();
console.log();

let base = 2;
let exponent = 3;
let result = 1;
for(let count = 0; count<= exponent;count++){
    result*=base;
}
console.log(base + " raise to the power of "+ exponent +" is" + result);

let numbersIn = 272;
let even = 0;
result = 0;
while(numbersIn != 0){
    even = numbersIn % 10;
    numbersIn=Math.floor(numbersIn/10);
    if (even % 2 == 0){
        result +=even;
    }
}
console.log("even digits in a number " + result);

numbersIn = 272;
let odd = 0;
result = 0;
while(numbersIn != 0){
    odd = numbersIn % 10;
    numbersIn=Math.floor(numbersIn/10);
    if (odd % 2 > 0){
        result +=odd;
    }
}
console.log("odd digits in a number " + result);

let prime = 0;
result = 0;
for (let count = 2; count <= 100; count++){
    let newcount = Math.floor(Math.sqrt(count));
    newcount++;
    let exp = 0;
    for(let counter = 2; counter <= newcount;counter++){
        exp = count%counter;
        if(exp == 0 ){
            break;
        }
    }
    if(exp>0){
        result+=count;
        console.log(count);
    }
    counter = 2;
}

prime = 0;
result = 0;
for (let count
