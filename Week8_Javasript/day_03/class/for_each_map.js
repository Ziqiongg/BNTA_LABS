//for each
const numbers = [1,2,3,4,5];

const printElement = numbers.forEach(number => console.log(number));

const printItem = (arrayElement) => {
    console.log(arrayElement);
}
numbers.forEach(printItem);


//map, auto create a new array, won't influence the old array
const double = numbers.map(number => number *2);
console.log(double);

//filter, return an array after filtering 
const filter = numbers.filter(num => {return num > 3;}
);

console.log(filter);

//reduce 1 + 2 + 3 + 4 +5
//const initialValue = 0;
const sumWithInitial = numbers.reduce(
    (previous, current) => previous * current);

console.log(sumWithInitial);



