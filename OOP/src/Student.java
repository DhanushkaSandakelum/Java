public class Student {
    /**
     * Access Modifiers - Defines the accessibility of member variables and methods
     * public: Accessible from any other class
     * private: Accessible within the same class
     * protected: Accessible within the same package and by subclasses
     */
    private String name;
    private int age;

    public Student() {
        this.name = "Sample Student";
        this.age = 10;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return  this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(obj == null || getClass() != obj.getClass())
            return false;

        return this.name.equals(((Student) obj).getName()) && this.age == ((Student) obj).getAge();
    }

    /**
     * Non-Static Methods
     * @desc: Associate with an instance of the class
     */
    public void printData() {
        String formattedString = String.format("Name: %s | Age: %d", this.name, this.age);
        System.out.println(formattedString);
    }

    /**
     * Static Methods
     * @desc: Static method belongs to class rather than an to an instance of the class.
     * Therefore, static methods can be called using the class name itself.
     */
    public static void testStaticMethod() {
        System.out.println("This is a test static method");
    }
}
