package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {

        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();

        } catch(IOException e) { // Replace the type with `Exception` to get multiple types of exceptions
            System.out.println("Sorry, an error occurred: " + e.getMessage());
        }
    }
}
