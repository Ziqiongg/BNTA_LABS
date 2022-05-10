package staff;

import animals.Animal;

public abstract class Staff implements Commuter {

    private String name;


    public Staff(String name, String role) {
        this.name = name;

    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    // Behavioursb

    public String cleanUp(){
        return "I'm cleaning the place up.";
    }

    public void feedAnimal(Animal animal){
        animal.eat();
    }

    public String sellTicket(){
        return "Ticket sold!";
    }



}
