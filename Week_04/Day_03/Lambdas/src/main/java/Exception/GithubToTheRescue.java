package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GithubToTheRescue {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        }


    }
}
