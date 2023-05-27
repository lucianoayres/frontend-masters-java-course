package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        File file = new File("files/numbers.txt");
        File outputFile = new File("files/output.txt");

        // try example with autocloseable resources, so you do not need to close them in a finally statement
        try (
                Scanner fileReader = new Scanner(file);
                PrintWriter fileWriter = new PrintWriter(outputFile);
        )  {
            while(fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
                fileWriter.print(fileReader.nextDouble());
            }

            // catches multiple Exceptions in a single catch
        } catch(FileNotFoundException | InputMismatchException  e) {
            System.out.println("An error has ocurred: ");
            System.out.println("Error Message: " + e.getMessage());
            System.out.println("Stack trace: ");
            e.printStackTrace();
        } catch(Exception e ) {
            System.out.println("An error has ocurred: ");
            System.out.println("Error Message: " + e.getMessage());
            System.out.println("Stack trace: ");
            e.printStackTrace();
        }

    }
}
