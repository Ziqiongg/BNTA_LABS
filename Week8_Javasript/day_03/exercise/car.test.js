const car = require("./car");

const testCar1 = new car("superman", 1000, "petrol");
const actual1 = 'superman';
const actual2 = 1000;
const actual3 = 'petrol' ;

describe('test car ', () =>{

    test("test car class", () => {

        expect(actual1).toBe(testCar1.manufacturer);
        
    } )
    
    test("test car class2", () => {
    
    
        expect(actual2).toBe(testCar1.price);
        
    } )
    
    test("test car class3", () => {
    
        expect(actual3).toBe(testCar1.engineType);
    } )
    

})
