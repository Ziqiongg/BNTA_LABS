package generics;

import java.util.HashSet;

public class Snack extends Reptile implements HasLegs {

    private String name;

    public Snack(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
