package item;

/**
 * Abstraction: Define abstract classes and methods to define generic behaviors
 */
public abstract class Item {
    private String title;
    private int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public abstract void displayInfo();

    // Getters and Setters
    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }
}
