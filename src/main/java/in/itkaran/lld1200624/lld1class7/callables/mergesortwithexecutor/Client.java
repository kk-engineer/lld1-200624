package in.itkaran.lld1200624.lld1class7.callables.mergesortwithexecutor;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {

        List<Integer> numbers = List.of(7,4,6,5,9,8,1,3,2);
        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(numbers, executorService);
        Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);
        //List<Integer> sortedList = mergeSorter.call();
        // get on Future is blocking
        // more business logic here ...
        System.out.println(sortedListFuture.get());
        executorService.shutdown();
    }
}
