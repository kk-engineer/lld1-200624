package in.itkaran.lld1200624.lld1class12.streams;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import in.itkaran.lld1200624.lld1class12.lambdas.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        
        //demoCreateStream();
        //demoStream();
        demoReduce();
    }

    private static void demoReduce() {
        // Example
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Identity is 0, Accumulator is Integer::sum
        int sum = numbers.stream()
                .reduce(0, Integer::sum); // Equivalent to (a, b) -> a + b

        System.out.println("Sum: " + sum); // Output: Sum: 15

        // Example
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);

        int product = numbers2.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product: " + product); // Output: Product: 120


        // Example
        List<String> words = Arrays.asList("apple", "bananas", "cherry", "date");

        Optional<String> longest = words.stream()
                .reduce((a, b) -> a.length() > b.length() ? a : b);

        longest.ifPresent(System.out::println); // Output: bananas

        // Example
        List<String> words2 = Arrays.asList("Java", "is", "awesome");

        String sentence = words2.stream()
                .reduce("", (a, b) -> a + " " + b);

        System.out.println(sentence.trim()); // Output: Java is awesome


        // Parallel Reduce
        Stream<String> stream = Stream.of("a", "b", "c", "d").parallel();

        // Identity is "", Accumulator concatenates, Combiner merges results
        String result = stream.reduce("", (s1, s2) -> s1 + s2, (s1, s2) -> s1 + s2);

        System.out.println(result); // Output: abcd
    }

    private static void demoCreateStream() {
        List<Integer> nums = Arrays.asList(2, 3, 1, 7, 6, 4, 5);
        // 1. using list
        Stream<Integer> stream1 = nums.stream();

        // 2. Directly create a stream
        Stream<Integer> stream2 = Stream.of(2, 3, 1, 7, 6, 4, 5);

        // 3. Stream - Builder design pattern
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(1);
        streamBuilder.add(2);
        streamBuilder.add(3);
        streamBuilder.add(4);
        streamBuilder.add(5);
        streamBuilder.build();
    }

    private static void demoStream() {
        List<Integer> nums = Arrays.asList(2,3,1,5,4);
        List<Integer> oddNums = nums.stream().filter((x) -> x%2==1).toList();
        System.out.println(oddNums);

        // Map students to marks
        List<Student> students = Arrays.asList(
                new Student("Ajay", 70, 2),
                new Student("Raghu", 90, 1),
                new Student("Anil", 50, 3)
        );
        System.out.println(students.stream().map((student) -> student.marks).toList());

        List<String> students2 = Arrays.asList("Anil", "Rakesh", "Ajay", "Raghu");
        System.out.println(students2.stream().map(String::toUpperCase).toList());

        System.out.println(students2.stream().map((student) -> student.toUpperCase()).toList());

        // FlatMap
        List<String> words2 = Arrays.asList("Hello", "World", "iPad", "MacBook Pro", "iPhone");
        List<List<String>> words2D = Arrays.asList(students2, words2);

        System.out.println(words2D);
        System.out.println(words2D.stream().flatMap(List::stream).map(String::toUpperCase).toList());


    }


}
