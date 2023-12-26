package item;

/**
 * Inheritance: Book class is inheriting from Item
 */
public class Book extends Item {
    private String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    // Getters and Setters
    public String getAuthor() {
        return this.author;
    }

    /**
     * Polymorphism: Implementing methods by overriding the parent class abstract methods to facilitate child class(Book) specific implementations
     */
    @Override
    public void displayInfo() {
        System.out.println("Book: " + this.getTitle() + " Year: " + this.getYear() + " Author: " + this.getAuthor());
    }
}
