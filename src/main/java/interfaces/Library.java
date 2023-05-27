package interfaces;

public class Library {

    public static void main(String[] args) {
        Product book = new Book();
        book.setName("A Tale of Two Cities");
        ((Book)book).setAuthor("Charles Dickens");
        System.out.println(((Book) book).getAuthor());
    }

}
