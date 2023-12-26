public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println("\n--- Int Stack ---");
        System.out.println("Int Stack Size: " + intStack.stackSize());
        System.out.println("Popped element: " + intStack.pop());
        System.out.println("Int Stack Size: " + intStack.stackSize());

        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Java");
        stringStack.push("C++");
        stringStack.push("Go");

        System.out.println("\n--- String Stack ---");
        System.out.println("String Stack Size: " + stringStack.stackSize());
        System.out.println("Popped element: " + stringStack.pop());
        System.out.println("String Stack Size: " + stringStack.stackSize());

    }
}