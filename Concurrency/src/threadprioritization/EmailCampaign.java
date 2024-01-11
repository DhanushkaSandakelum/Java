package threadprioritization;

public class EmailCampaign implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName());

            if(i == 5) {
                // Notify scheduler that the thread is willing to yield its current use of CPU
                Thread.currentThread().yield();
            }
        }
    }
}
