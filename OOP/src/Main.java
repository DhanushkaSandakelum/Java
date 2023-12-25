public class Main {
    public static void main(String[] args) {
        // Initializing Objects using constructors
        Student stu = new Student();
        Student stu1 = new Student("Dhanushka", 24);
        Student stu2 = new Student("Janindu", 18);

        // Use standard getters and setters
        System.out.println("--- Use Getters and Setters ---");
        stu.setName("Alex");
        stu.setAge(21);
        System.out.println("Name: " + stu.getName() + " | Age: " + stu.getAge());

        System.out.println("--- Calling non-static methods ---");
        stu.printData();
        stu1.printData();
        stu2.printData();

        System.out.println("--- Calling static methods ---");
        Student.testStaticMethod();

        System.out.println("--- Compare objects ---");
        Student stu3 = new Student("Dhanushka", 24);
        System.out.println("Reference Comparison: " + (stu1 == stu3));
        System.out.println("Content Comparison: " + stu1.equals(stu3));
    }
}