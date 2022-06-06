const sum = function(a, b){
    return a + b;
}

const even = function(a){
    if (a % 2 == 0){
        return true;
    } else{
        return false;
    }
}


//if you want to test more functions, module.exports = {sum, multiply, fdfdsf};
module.exports = {sum,even};
