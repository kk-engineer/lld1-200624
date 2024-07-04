package in.itkaran.lld1200624.lld1class9.semaphoresolution;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> queue = new ConcurrentLinkedQueue<>();
        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        Producer p1 = new Producer(queue, "p1", producerSemaphore, consumerSemaphore);
        Producer p2 = new Producer(queue, "p2", producerSemaphore, consumerSemaphore);
        Producer p3 = new Producer(queue, "p3", producerSemaphore, consumerSemaphore);
        Producer p4 = new Producer(queue, "p4", producerSemaphore, consumerSemaphore);
        Producer p5 = new Producer(queue, "p5", producerSemaphore, consumerSemaphore);

        Consumer c1 = new Consumer(queue, "c1", producerSemaphore, consumerSemaphore);
        Consumer c2 = new Consumer(queue, "c2", producerSemaphore, consumerSemaphore);
        Consumer c3 = new Consumer(queue, "c3", producerSemaphore, consumerSemaphore);
        Consumer c4 = new Consumer(queue, "c4", producerSemaphore, consumerSemaphore);
        Consumer c5 = new Consumer(queue, "c5", producerSemaphore, consumerSemaphore);


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

// Break till 8:41 AM


}
