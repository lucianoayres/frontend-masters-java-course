package strings;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love Java");
        System.out.println("------");
        reverseString("Hello World!");
        System.out.println("------");
        addSpaces("HelloWorld!It'sMeAngie");
        System.out.println("------");
        printTextBlockSample();
    }

    public static void printTextBlockSample() {
        System.out.println("""
                    {
                        id: 9,
                        name: Joe,
                        age: 29,
                        country: "Brazil",
                    }
                """);
    }

    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++) {
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }

    public static void reverseString(String text) {
        for(int i = text.length()-1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for (String word: words) {
            System.out.println(word);
        }
    }


}
