public class Bookk {
    String bookName;
    String author;
    String publisher;
    int price;
    String yearOfPublished;

    // Constructor
    public Bookk(String b, String a, String p, int pr, String y) {
        bookName = b;
        author = a;
        publisher = p;
        price = pr;
        yearOfPublished = y;
    }

    // Display method
    public void display() {
        System.out.println("Book Details:");
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Year of Published: " + yearOfPublished);
    }
}
