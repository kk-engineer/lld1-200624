package in.itkaran.lld1200624.lld1class7.executors;

public class NumberPrinter implements Runnable{
    private int number;
    public NumberPrinter(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Printing number " + this.number + " " + Thread.currentThread().getName());
    }
}
