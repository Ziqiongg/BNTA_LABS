numbers = [1,2,3,4,5];



for (num of numbers){
    console.log(`value of number inside the loop: ${num}`);
}

//num in the global scope
console.log(num);

//if you add let before num, restrict num in this loop 
for (let num of numbers){
    console.log(`value of number inside the loop: ${num}`);
}


// let in the global scope

let numberToPrint = 0;
//or
//let numberToPrint;

for (num of numbers){
    numberToPrint = num;
    console.log(`value of number inside the loop: ${num}`);
}
console.log(numberToPrint);

//const array or object, although we change elements of the array, it still the same array.
const numberSquared = [];
for (num of numbers){
    numberSquared.push(num**2);
}
console.log(numberSquared);

//don't use var 


