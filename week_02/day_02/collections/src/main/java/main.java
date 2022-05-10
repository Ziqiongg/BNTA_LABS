import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        String item1 = "milk";
        String item2 = "bread";
        String item3 = "coffee";
        String item4 = "toothpaste";

        String[] shoppingList = new String[5];
        // inserting into array
        shoppingList[0] = "milk";
        System.out.println(shoppingList[0]);
        //Arraylist
        ArrayList<String> betterShoppingList = new ArrayList<>();
        betterShoppingList.add("milk");
        betterShoppingList.add("egg");
        betterShoppingList.add("bread");
        //search for an item
        betterShoppingList.indexOf("egg");
        //display item at a specific indx
        betterShoppingList.get(2);
        //count items in array list
        betterShoppingList.size();
        //remove item
        betterShoppingList.remove(2);
        //check if item is present
        betterShoppingList.contains("milk");
        //clear all
        betterShoppingList.clear();
        //is empty
        System.out.println(betterShoppingList.isEmpty());


        //Map - HashMap
        //key-value pairs

        HashMap<String, Integer> mappedShoppingList = new HashMap<>();
        // add a value
        mappedShoppingList.put("milk",3);
        mappedShoppingList.put("bread",14);

        //accessing a value
        mappedShoppingList.get("milk");
        //deleting a value
        mappedShoppingList.remove("eggs");
        //updating value
        mappedShoppingList.replace("bread",34);
        mappedShoppingList.replace("bread",null);

        mappedShoppingList.keySet();
        mappedShoppingList.values();






    }
}
