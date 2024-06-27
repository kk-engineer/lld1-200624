package in.itkaran.lld1200624.lld1class6.introtothreads;

public class Client {
    public static void main(String[] args) {
        System.out.println("Main thread started - name : " + Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

        for (int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread1 = new Thread(numberPrinter);
            thread1.start(); // create a thread and call the run() method
        }
    }
}
