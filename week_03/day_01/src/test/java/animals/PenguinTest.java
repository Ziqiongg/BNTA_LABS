package animals;

import static org.junit.jupiter.api.Assertions.*;

import animals.Penguin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PenguinTest {

    private Penguin penguin;

    @BeforeEach
    void setup(){
        penguin = new Penguin("Nils Olav",6,"fish");
    }

    @Test
    void namePropertyHasInheritedCorrectly(){
        assertEquals("Nils Olav", penguin.getName());
    }
    @Test
    void canLayEgg(){
        assertEquals("I lay an egg!", penguin.layEgg());
    }
}
