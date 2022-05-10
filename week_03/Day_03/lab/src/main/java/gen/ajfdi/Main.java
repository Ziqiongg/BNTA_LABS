//package gen.ajfdi;
//
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList nonGenericList = new ArrayList();
//
//        nonGenericList.add(1);
//        nonGenericList.add("String");
//        nonGenericList.add(new Person());
//
//        Object object = nonGenericList.get(1);
//        Person person = (Person) object;
//        person.personMethod();
//
//        ArrayList<Person> personTypeOnly = new ArrayList<>();
////        compiler errors: only objects of type Person are allowed!
////        personTypeOnly.add(1);
//        personTypeOnly.add(new Person());
////        personTypeOnly.add("");
//
//    }
//    }
//
//
//}
//
