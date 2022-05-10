package staff;

import animals.Animal;

public class Keeper extends Staff implements Feeder, Cleaner{
    public Keeper(String name, String role) {
        super(name, role);
    }

    public void feedAnimal(Animal animal){
        animal.eat();
    }

    public String cleanUp(){
        return "These messy";
    }
    public void goHomeAtEndOfDay(){

    }

}
