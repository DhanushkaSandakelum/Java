interface displayModule {
    public void display();
}

class Monitor implements displayModule {
    public void display() {
        System.out.println("Display through Monitor");
    }
}

class Projector implements displayModule {
    public void display() {
        System.out.println("Display through Projector");
    }
}

public class Computer {
    displayModule dm;

    public void setDisplayModule(displayModule dm){
        this.dm = dm;
    }

    public void display(){
        dm.display();
    }

    public static void main(String[] args) {
        Computer cm = new Computer();

        // Instances of the interface implemented classes
        displayModule dm1 = new Monitor();
        displayModule dm2 = new Projector();

        // Polymorphically pass the instances to the Computer class and invoke the display()
        cm.setDisplayModule(dm1);
        cm.display();
        cm.setDisplayModule(dm2);
        cm.display();
    }
}