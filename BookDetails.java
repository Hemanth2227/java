class Book {
    String title;
    String author;
    double price;
    int yearPublished;
    public Book(String title, String author, double price, int yearPublished) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.yearPublished = yearPublished;
    }
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: RS " + price );
        System.out.println("Year Published: " + yearPublished);
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Book book = new Book("The Marvels", "Brian Selznick", 99.99, 2015);
        book.displayDetails();
    }
}