package animals;

public class Penguin extends Bird {


    public Penguin(String name, int age,String diet) {
        super(name, age, diet);
    }

    public String layEgg(){
        return "I lay an egg!";
    }

    @Override
    public String introduce(){
        return "hello ";

    }

    public void reproduce(){
        layEgg();
    }
}
