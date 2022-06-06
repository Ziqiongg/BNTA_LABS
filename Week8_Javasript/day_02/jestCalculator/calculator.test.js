const {sum,even} = require('./calculator');

describe('add functionality', () => {
    test('can add two small positive numbers', () =>{
        //arrange -do set up
        //act - call the function under test
        const actual = sum(2,3); 
        //assert - call the assertion method 
        const expected = 5;
        expect(actual).toBe(expected);
    
    })

    test("2 is even", () => {
        expect(even(2)).toBe(true);
    })
})

