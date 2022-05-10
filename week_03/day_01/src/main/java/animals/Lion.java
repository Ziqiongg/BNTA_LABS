package animals;

public class Lion extends Animal{

    private boolean canWaitToBeKing;


    public Lion(String name, int age, String diet, boolean canWaitToBeKing) {
        super(name, age, diet);
        this.canWaitToBeKing = canWaitToBeKing;
    }

    @Override
    public String makeNoise(){
        return "Roar!";
    }

    public String introduce(){
        return "Hi, there, my name is " + this.name;
    }

    public void reproduce(){
        System.out.println("I am having a baby");

    }
}
