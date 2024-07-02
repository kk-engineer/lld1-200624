package in.itkaran.lld1200624.lld1class8.addersubtractorwithlock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    private Lock lock;

    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            lock.lock();
            System.out.println("Adder : " + i + " " + Thread.currentThread().getName());
            count.value += i;
            lock.unlock();
        }

    }
}
