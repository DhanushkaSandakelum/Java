public class Main {
    // Main Thread - Daemon thread run by JVM
    public static void main(String[] args) {
        Task task = new Task();

        // User application thread - Non-daemon thread
        Thread thread = new Thread(task); // NEW
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Inside main");
    }
}