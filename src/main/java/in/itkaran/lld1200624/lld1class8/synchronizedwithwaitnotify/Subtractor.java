package in.itkaran.lld1200624.lld1class8.synchronizedwithwaitnotify;


public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            synchronized (count) {
                while (count.isAdderTurn) { // Wait if it's not Subtractor's turn
                    try {
                        count.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Subtractor : " + i + " " + Thread.currentThread().getName());
                count.value -= i;
                count.isAdderTurn = true; // Switch turn to Adder
                count.notify(); // Notify the waiting Adder thread
            }
        }
    }
}
