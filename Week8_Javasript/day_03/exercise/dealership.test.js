const car = require("./car");
const dealership = require("./dealership");

const car1 = new car("mOne", 1000, "eOne");
const car2 = new car("mTwo", 700, "eTwo");
const car3 = new car("mThree", 1000, "eThree");
const car4 = new car("mFour", 1000, "eFour");
const car5 = new car("mFive", 1000, "eFive");

const shop1 = new dealership("shopOne", 4);


shop1.addCarToStock(car1);
shop1.addCarToStock(car2);
shop1.addCarToStock(car3);
shop1.addCarToStock(car4);

test("count the number of cars in stock", () => {
    let expected = 4;
    let actual = shop1.countStockCar();
    expect(actual).toBe(expected);
})

test("add  stock", () => {
    let expected = "we are full now";
    let actual = shop1.addCarToStock(car5);
    expect(actual).toBe(expected);
})

