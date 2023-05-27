package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        File file = new File("files/numbers.txt");
        Scanner fileReader = null;
        try  {
            fileReader = new Scanner(file);

            while(fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }

        // catches multiple Exceptions in a single catch
        } catch(FileNotFoundException | InputMismatchException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(Exception e ) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            assert fileReader != null;
            fileReader.close();
        }

    }
}
