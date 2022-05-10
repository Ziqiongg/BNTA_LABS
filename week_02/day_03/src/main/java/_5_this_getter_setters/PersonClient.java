package _5_this_getter_setters;

public class PersonClient {
    public static void main(String[] args) {
        Person person1 = new Person("carol","283492",19);
        person1.setAge(18);
        int ageone = person1.getAge();
        System.out.println(ageone);

    }
}
