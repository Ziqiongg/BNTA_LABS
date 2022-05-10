package animals;

public abstract class Animal {


    protected String name;

    private int age;

    private String species;

    private String diet;

    public Animal(String name, int age, String diet) {
        this.name = name;
        this.age = age;
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }


    //behaviours
    public String eat() {
        return "Mum, tasty" + this.diet;
    }

    public String sleep(){
        return "Zzz";
    }

    public String makeNoise() {
        return "Noot noot";
    }

    public String introduce(){
        return "hello, i am " + this.name;
    }

    public abstract void reproduce();

}
