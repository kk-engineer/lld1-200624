package in.itkaran.lld1200624.lld1class9.mutexsolution;

import java.util.Queue;

public class Producer implements Runnable {
    private Queue<Object> queue;
    private String name;
    private int maxSize;

    public Producer(Queue<Object> queue, String name, int maxSize) {
        this.queue = queue;
        this.name = name;
        this.maxSize = maxSize;
    }

    public void run() {
        while (true) {
            synchronized (queue) {  // got lock here
                if (this.queue.size() < maxSize) {
                    System.out.println(this.name + " Adding an element to the queue, size: " + this.queue.size());
                    // pre-empted
                    queue.add(new Object());
                    System.out.println(this.name + " AFTER: Adding an element to the queue, size: " + this.queue.size());
                }
            }
        }
    }
}
