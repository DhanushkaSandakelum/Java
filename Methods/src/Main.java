import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start value: ");
        int start = scanner.nextInt();

        System.out.println("Enter end value: ");
        int end = scanner.nextInt();

        for (int i = start; i < end; i++) {
            if (PrimeHelper.isPrime(i)){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}