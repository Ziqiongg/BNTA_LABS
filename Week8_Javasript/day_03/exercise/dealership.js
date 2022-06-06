const car = require("./car");

const dealership = function(name, maxCar){
    this.name = name;
    this.maxCar = maxCar;
    this.stockCar = [];
}

//Count the number of cars in stock
dealership.prototype.countStockCar = function() {
    return this.stockCar.length;

}

//Add a car to stock
dealership.prototype.addCarToStock = function(car) {
    if (this.stockCar.length < this.maxCar){
        this.stockCar.push(car);
    } else {
        return "we are full now";
    }
    
}

//Return an array containing each car's manufacturer
dealership.prototype.getManufacturer = function() {
    return this.stockCar.map(car => car.manufacturer);
}

//Find all the cars from a given manufacturer
dealership.prototype.specificCar = function(manufacturerName) {
    return this.stockCar.filter(car => car.manufacturer === manufacturerName);

}

//Find the total value of all the cars in stock
dealership.prototype.totalPrice = function(){
    let priceList = this.stockCar.map(car => car.price);
    
    return priceList.reduce(
        (accumulator, currentValue) => 
            accumulator + currentValue
    );

}

const car1 = new car("mOne", 1000, "eOne");
const car2 = new car("mTwo", 700, "eTwo");
const car3 = new car("mThree", 1000, "eThree");
const car4 = new car("mFour", 1000, "eFour");

const shop1 = new dealership("shopOne", 100);


shop1.addCarToStock(car1);
shop1.addCarToStock(car2);
shop1.addCarToStock(car3);
shop1.addCarToStock(car4);


console.log(shop1.countStockCar);

module.exports = dealership;



