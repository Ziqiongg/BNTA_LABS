const sum = (n1,n2) => {
    console.log(n1 + n2);
}
const substract = (n1,n2) => {
    console.log(n1 - n2);
}

//higher order function, pass in functions as parameter
const doCalculation = (n1,n2, callback) =>{
    callback(n1,n2);
    
}


sum(10,20);
substract(10,20);

doCalculation(10,20,sum);
doCalculation(10,20,substract);
doCalculation(10,20,(n1,n2) => {
    console.log(n1*n2);
}
);
















