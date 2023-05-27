package data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        //setDemo();
        //listDemo();
        queueDemo();

    }

    private static void queueDemo() {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("lemon");
        fruits.add("orange");

        var removed = fruits.remove(); //first thing, first out
        System.out.println("removed: " + removed);
        System.out.println("head of the queue: " + fruits.peek());

        System.out.println(fruits);

    }

    private static void listDemo() {
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.set(2, "grape");
        fruits.add("lemon");
        //fruits.remove("lemon"); //removes first found
        //fruits.remove(3); //overloaded method to remove by index

        System.out.println("index 2: " + fruits.get(2));
        System.out.println("index of grape: " +  fruits.indexOf("grape"));
        System.out.println("last index of lemon: " + fruits.lastIndexOf("lemon"));

        System.out.println(fruits);

        List moreFruit = List.of("cherry", "plum"); //immutable
    }

    public static void setDemo(){
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");

        fruits.add("apple");

        System.out.println(fruits);

        fruits.remove("lemon");

        System.out.println("contains lemon? " + fruits.contains("lemon"));

        System.out.println("size: " + fruits.size());

        // immutable set
        Set moreFruit = Set.of("pear", "raisin", "cherry");

        // this will throw an error, because the usage of 'Set.of` makes the Set immutable
        moreFruit.add("cranberry");

        System.out.println(moreFruit);

        Set numbers = new HashSet();
        Integer firstNumber = 40;
        Integer secondNumber = 100;

        numbers.add(firstNumber);
        numbers.add(secondNumber);

        System.out.println(numbers);
    }
}
