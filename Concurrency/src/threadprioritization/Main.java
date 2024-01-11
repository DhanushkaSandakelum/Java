package threadprioritization;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        Thread t1 = new Thread(new EmailCampaign());
        Thread t2 = new Thread(new DataAggregator());

        // Thread Naming
        t1.setName("EmailCampaign");
        t2.setName("DataAggregator");

        // Thread Prioritization
        // Specify the Thread priorities for each thread, then Thread scheduler may prioritize threads
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        // Thread Joining
        try {
            // Suspend main thread until t2 dies
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Inside main");
    }
}
