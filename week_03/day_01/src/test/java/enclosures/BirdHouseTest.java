package enclosures;

import animals.Parrot;
import animals.Penguin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdHouseTest {

    @Test
    void canCountAnimals(){
        BirdHouse birdHouse = new BirdHouse("test house");
        assertEquals(0,birdHouse.countAnimals());
    }

    @Test
    void canAddDifferentTypesOfBirds(){
        BirdHouse birdHouse = new BirdHouse("test house");
        Penguin penguin = new Penguin("Pingu",36,"fish");
        Parrot parrot = new Parrot("Plooy",25, "seeds");
        birdHouse.addAnimal(penguin);
        birdHouse.addAnimal(penguin);
        assertEquals(2, birdHouse.countAnimals());
    }

}