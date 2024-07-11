package in.itkaran.lld1200624.lld1class12.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Client {
    public static void main(String[] args) {

        //demoLambda();
        // demoRunnableExample();
        demoComparator();
    }

    private static void demoComparator() {

        List<Student> students = Arrays.asList(
                new Student("Ajay", 70, 2),
                new Student("Raghu", 90, 1),
                new Student("Anil", 50, 3)
        );

        Comparator<Student> marksComparator = (st1, st2) -> st1.marks - st2.marks;

        students.sort(marksComparator);
        System.out.println(students);
        Comparator<Student> rollNumComparator = (st1, st2) -> st1.rollNum - st2.rollNum;
        students.sort(rollNumComparator);
        System.out.println(students);
    }

    private static void demoRunnableExample() {
        Runnable runnable = () -> {
            System.out.println("Hello from thread " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable);
        thread.start();

        // More optimised

        Thread thread2 = new Thread(() -> System.out.println("Hello from thread " + Thread.currentThread().getName()));
        thread2.start();

    }

    private static void demoLambda() {
        Consumer<String> c1 = (str) -> {
            System.out.println(str);
        };
        c1.accept("Scaler");

        BiConsumer<String, Integer> c2 = (str, n) -> {
            System.out.println(str + " " + n);
        };

        c2.accept("Scaler", 2);

        Predicate<String> p1 = (str) -> {
            if (str.length() > 5) return true;
            return false;
        };

        System.out.println(p1.test("Scaler"));
        System.out.println(p1.test("Ajay"));

        Predicate<String> p2 = (str) -> { return str.length() > 5; };

        System.out.println(p2.test("Scaler"));
        System.out.println(p2.test("Ajay"));


        Predicate<String> p3 = (str) ->  str.length() > 5;

        System.out.println(p3.test("Scaler"));
        System.out.println(p3.test("Ajay"));
    }
}
