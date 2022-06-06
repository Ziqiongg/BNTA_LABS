//1.named function
function greet(){
    console.log("good morning");
}

greet();

// function with parameter
function greet2(timeOfDay, name){
    console.log(`good ${timeOfDay}, ${name}`);
}

greet2("afternoon","carol");
//still working, only pick the first two element
greet2("afternoon","carol", "extra argument");
// will show undefined 
greet2("carol");

//return 
function greet3(timeOfDay, name){
    return `good ${timeOfDay}, ${name}`;
}
const greeting3 = greet3("afternoon","carol");
console.log(greeting3);


//2. anonymous function
const sum = function (number1, number2){
    return number1+ number2
}
const total = sum(1,2);
console.log(total);

//3. arrow function, still anonymous function
const multiply = (number1,number2) => {
    return number1 * number2;
}
const product = multiply(4,5);
console.log(product);
