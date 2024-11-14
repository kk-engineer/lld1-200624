package in.itkaran.lld1200624.lld1class8.synchronizedwithwaitnotify;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            synchronized (count) {
                while (!count.isAdderTurn) { // Wait if it's not Adder's turn
                    try {
                        count.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Adder : " + i + " " + Thread.currentThread().getName());
                count.value += i;
                count.isAdderTurn = false; // Switch turn to Subtractor
                count.notify(); // Notify the waiting Subtractor thread
            }
        }
    }
}
