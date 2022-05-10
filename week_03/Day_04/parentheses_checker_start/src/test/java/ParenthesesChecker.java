import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ParenthesesChecker {


    public ParenthesesChecker() {
    }

    public boolean checkParentheses(String sentence, ArrayList<String> youWantcheck){

        ArrayList<String> checkSome = new ArrayList<>();

        //collect all parentheses to the checkSome list
        String[] letters = sentence.split("");

        for(String letter : letters)
        {
            if (letter.equals(youWantcheck.indexOf(0)) || letter.equals(youWantcheck.indexOf(1)) )
            {
                checkSome.add(letter);
            }

        }

        // check if the first one is ( and second one is )

        if (checkSome.size() %2 ==0 && checkSome.indexOf(0)==youWantcheck.indexOf(0) && checkSome.indexOf(1)==youWantcheck.indexOf(1) ){

            return true;




        } else {
            return false;
        }




    }


}
