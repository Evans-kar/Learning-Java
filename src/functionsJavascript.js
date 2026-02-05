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

function mystery(a, b=3) {
    return a * b;
}
console.log(mystery(4));

//function expressions example
const add = function (a, b) {
    return a + b;
}
let z = add(5,28)
console.log(z);
