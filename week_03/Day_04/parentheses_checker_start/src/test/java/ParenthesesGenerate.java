import java.util.ArrayList;

public class ParenthesesGenerate {

    public ArrayList<String> normal(){
        ArrayList<String> normalParentheses = new ArrayList<>();
        normalParentheses.add("(");
        normalParentheses.add(")");
        return  normalParentheses;
    }

    public ArrayList<String> square(){
        ArrayList<String> squareParentheses = new ArrayList<>();
        squareParentheses.add("[");
        squareParentheses.add("]");
        return  squareParentheses;
    }

    public ArrayList<String> curly(){
        ArrayList<String> curlyParentheses = new ArrayList<>();
        curlyParentheses.add("{");
        curlyParentheses.add("}");
        return  curlyParentheses;
    }

    public ArrayList<String> angle(){
        ArrayList<String> angleParentheses = new ArrayList<>();
        angleParentheses.add("<");
        angleParentheses.add(">");
        return  angleParentheses;
    }


}
