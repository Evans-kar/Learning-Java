function addTwoNumbers(a,b) {
    return a+b;
}
let sum1 = addTwoNumbers(3,5);
let sum2 = addTwoNumbers(5,5);
console.log(sum1 + sum2);

function greetings(name = "Guests") {
    console.log(`Hello ${name}!`);
}
greetings();
greetings("Anna");
greetings("John");

