package animals;

import animals.Lion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LionTest {

    private Lion lion;

    @BeforeEach
    void setup(){
        lion = new Lion("Simba",28,"zebra",true);

    }

    @Test
    void canmakeNoise(){
        assertEquals("Roar!",lion.makeNoise());
    }

}