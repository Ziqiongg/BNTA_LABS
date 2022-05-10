package staff;

public class Janitor extends Staff implements Cleaner{
    public Janitor(String name, String role) {
        super(name, role);
    }

    public String cleanUp(){
        return "clean";
    }


    public void goHomeAtEndOfDay(){

    }


}
