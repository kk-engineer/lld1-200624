package in.itkaran.lld1200624.lld2.singleton.multithreaded;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        demoMultithreaded();
    }

    private static void demoMultithreaded()  {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            SingletonObjectCreator singletonObjectCreator = new SingletonObjectCreator();
            executor.execute(singletonObjectCreator);
        }
        executor.shutdown();
    }
}
