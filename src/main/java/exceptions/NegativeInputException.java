package exceptions;

public class NegativeInputException extends Exception {

    public NegativeInputException(){
        // when you call 'this' with a string parameter, you are invoking the class constructor that takes
        // a string as parameter, which is declared next
        this("Input must be greater than or equal to 0");
    }

    public NegativeInputException(String message) {
        super(message);
    }
}
