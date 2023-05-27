package data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        //setDemo();
        listDemo();
        //queueDemo();
        //mapDemo();

    }

    private static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap(); // unordered key-value list
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);

        fruitCalories.put("orange", 45); // if you add a repeated key, it will replace the previous one

        fruitCalories.putIfAbsent("lemon", 17); // only adds if there`s no identical key

        fruitCalories.remove("banana");

        System.out.println(fruitCalories);
        System.out.println("apple calories: " + fruitCalories.get("apple"));
        System.out.println("contains orange? " + fruitCalories.containsKey("orange"));

        Map immutableFruitCalories = Map.of(1, "grapes", 2, "strawberry");

        System.out.println(immutableFruitCalories);

        Set mapEntries = fruitCalories.entrySet();
        var i = mapEntries.iterator();

        while(i.hasNext()){
            Map.Entry entry = (Map.Entry)i.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("Enhanced For loop");

        for (Map.Entry calorieInfo : fruitCalories.entrySet()) {
            System.out.println(calorieInfo.getKey() + ": " +  calorieInfo.getValue());
        }

        Map<String, String> newFruitMap = new HashMap();

        newFruitMap.put("apple", "good");
        newFruitMap.put("lemon", "average");
        newFruitMap.put("watermelon", "great");


        for (Map.Entry newFruit : newFruitMap.entrySet()) {
            System.out.println(newFruit.getKey() + ": " +  newFruit.getValue());
        }

        // Iterating with forEach

        System.out.println("Iterating with forEach");

        fruitCalories.forEach((k,v) -> System.out.println(k + ": " + v));

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
        List<String> fruits = new ArrayList();
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

        // Iterating with enhanced For loop
        System.out.println("Iterating with enhanced For loop");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Iterating with forEach");

        fruits.forEach(f-> System.out.println(f)); // lambda expression as parameter to print each item

        System.out.println("Using method reference");
        // method reference is just syntax sugar for a lambda expression
        fruits.forEach(System.out::println); // lambda expression with `method reference`(classname)

        fruits.forEach(f-> {
            System.out.println("Lambda function (anonymous function) with code block");
            System.out.println(f);
        }); // with multiple lines in the expression
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
        // moreFruit.add("cranberry");

        System.out.println(moreFruit);

        Set numbers = new HashSet();
        Integer firstNumber = 40;
        Integer secondNumber = 100;

        numbers.add(firstNumber);
        numbers.add(secondNumber);

        System.out.println(numbers);

        // loop Set with iterator
        System.out.println("Loop Set item with iterator");
        var i = fruits.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        };
    }
}
