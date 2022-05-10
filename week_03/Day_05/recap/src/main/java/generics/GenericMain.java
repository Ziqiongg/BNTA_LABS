package generics;

public class GenericMain {

    private static Owner<? super Pet> coli;

    public static void main(String[] args) {

        Dog dog = new Dog("Maisie");
        Owner<Pet> edward = new Owner<>("Edward", dog);

        Cat cat = new Cat("Night");
        Owner ana = new Owner("Ana", cat);

        Tortoise tortoise = new Tortoise("Ella");
        Owner<? extends Reptile> carol = new Owner("Carol", tortoise);

        Snack snake  = new Snack("Sid");
        Owner<? super Pet> coli = new Owner<>("colin", snake);


    }


}
