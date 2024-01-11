package assertions;


// To enable assertions when running this program, you can use the following command:
// java -ea Assertion
public class Assertion {
    public static void main(String[] args) {
        int age = 25;

        // Using assert to check if the age is positive
        assert age >= 0 : "Age cannot be negative";

        System.out.println("Age: " + age);
    }
}
