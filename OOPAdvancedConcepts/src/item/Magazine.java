package item;

/**
 * Inheritance: Magazine class is inheriting from Item
 */
public class Magazine extends Item{
    private String publisher;

    public Magazine(String title, int year, String publisher) {
        super(title, year);
        this.publisher = publisher;
    }

    // Getters and Setters
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Polymorphism: Implementing methods by overriding the parent class abstract methods to facilitate child class(Magazine) specific implementations
     */
    @Override
    public void displayInfo() {
        System.out.println("Magazine: " + this.getTitle() + " Year: " + this.getYear() + " Publisher: " + this.getPublisher());
    }
}
