import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        for (int i = 1;i <= 10; i++) {
//            System.out.println(i);
//        }

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("milk");
        shoppingList.add("apples");
        shoppingList.add("crisps");
        shoppingList.add("bread");
        shoppingList.add("eggs");
//        for (int i = 0; i < shoppingList.size(); i++) {
//            System.out.println(shoppingList.get(i));
//        }
//
//        for (int i = 2; i < shoppingList.size(); i++){
//            System.out.println(shoppingList.get(i));
//        }
        for (String thing :  shoppingList){
            System.out.println(thing);
        }

        for (int i = 0; i < shoppingList.size(); i ++){
            shoppingList.remove(i);
            System.out.println(shoppingList);
        }
        System.out.println(shoppingList);

    }
}
