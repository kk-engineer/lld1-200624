package in.itkaran.lld1200624.lld1class9.mutexsolution;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Client {
    public static void main(String[] args) {
        Queue<Object> queue = new ConcurrentLinkedQueue<>();
        int maxSize = 10;

        Producer p1 = new Producer(queue, "p1", maxSize);
        Producer p2 = new Producer(queue, "p2", maxSize);
        Producer p3 = new Producer(queue, "p3", maxSize);
        Producer p4 = new Producer(queue, "p4", maxSize);
        Producer p5 = new Producer(queue, "p5", maxSize);

        Consumer c1 = new Consumer(queue, "c1", maxSize);
        Consumer c2 = new Consumer(queue, "c2", maxSize);
        Consumer c3 = new Consumer(queue, "c3", maxSize);
        Consumer c4 = new Consumer(queue, "c4", maxSize);
        Consumer c5 = new Consumer(queue, "c5", maxSize);


        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);
        Thread t6 = new Thread(c1);
        Thread t7 = new Thread(c2);
        Thread t8 = new Thread(c3);
        Thread t9 = new Thread(c4);
        Thread t10 = new Thread(c5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

    }



}
