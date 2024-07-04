package in.itkaran.lld1200624.lld1class9.semaphoresolution;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Object> queue;
    private String name;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;


    public Producer(Queue<Object> queue, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.queue = queue;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    public void run() {
        while (true) {
            try {
                this.producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.name + " Adding an element to the queue, size: " + this.queue.size());
            queue.add(new Object());
            System.out.println(this.name + " AFTER: Adding an element to the queue, size: " + this.queue.size());
            consumerSemaphore.release();
        }
    }
}
