package synchronization;

public class BankAccount implements Runnable{
    private int balance;

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void run() {
        makeWithdrawal(75);

        if (balance < 0) {
            System.out.println("Money overdrawn!!!");
        }
    }

    public synchronized void makeWithdrawal(int amount) {
        if(balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount);
        }
        else {
            System.out.println("Not enough balance for " + Thread.currentThread().getName());
        }
    }
}
