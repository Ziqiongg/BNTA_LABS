package generics;

public class Owner<T> {


    private String name;
    private T pet;

    public Owner(String name, T pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getPet() {
        return pet;
    }

    public void setPet(T pet) {
        this.pet = pet;
    }




}
