// Constructor Functions

const Laptop = require("./laptop");

const Student = function(name) {
    this.name = name;
    this.laptop = null
    this.greet = function() {
        console.log(`Hello, my name is ${this.name}`);
    }
}

//you can use prototype to create method outside the Student function
Student.prototype.greet2 = function() {
    console.log(`Hello, my name is ${this.name}`);
}

Student.prototype.buyLaptop = function(newLaptop){
    this.laptop = newLaptop

}



const alice = new Student("Alice");
alice.greet();
const bob = new Student("bob")
bob.greet();

console.log(alice);
const newImac = new Laptop("Apple", "iMac", "osx");
alice.buyLaptop(newImac);
console.log(alice);




// constructor function practice
const Cartoon = function(charactor,age) {
    this.charactor = charactor;
    this.age = age;
}

Cartoon.prototype.introduceMe = function(){
    console.log(`Hi, i am ${this.charactor}`);
}

Cartoon.prototype.myhobby = function(hobby){
    console.log(hobby);
}

const pinGu = new Cartoon("pingu", 22);
pinGu.myhobby("say hi");
pinGu.introduceMe();
