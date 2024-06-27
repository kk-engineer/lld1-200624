package in.itkaran.lld1200624.lld1class6.introtothreads;

public class HelloWorldPrinter implements Runnable {

    public void run() {
        System.out.println("Hello World - name:" + Thread.currentThread().getName());
    }
}
