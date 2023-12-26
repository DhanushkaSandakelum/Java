package objects;

/**
 * Abstract Class: Used to abstract methods and fields
 * @desc: Any child class have only one abstract class that extend it
 */
public abstract class Object {
    private double volume;
    private double objectArea;

    public Object(){
        this.volume = 0;
        this.objectArea = 0;
    }

    public abstract double calculateVolume();

    public abstract double calculateObjectArea();

    public void displayInfo() {
        System.out.println("Volume: " + this.calculateVolume() + " Object Area: " + this.calculateObjectArea());
    }
}
