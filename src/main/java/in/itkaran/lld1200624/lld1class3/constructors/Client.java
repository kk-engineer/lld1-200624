package in.itkaran.lld1200624.lld1class3.constructors;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoConstructor();
//        demoPassByValue();
//        try {
//            demoFinalize();
//        } catch (Throwable throwable) {
//            System.out.println("Exception: " + throwable.getMessage());
//        }
    }

    private static void demoFinalize() throws Throwable {
        Student s = new Student();
        s.finalize();
        // set the object null for garbage collection
        s = null;
        System.gc();    // will call finalize method of the class implicitly.
    }

    private static void demoPassByValue() {
        int x = 5;
        fun(x);
        System.out.println(x);
        System.out.println("Debug");
        List<Integer> marks = new ArrayList<>();
        marks.add(57);
        marks.add(83);
        Student student1 = new Student("Akshay", 25, 77, marks);
        fun2(student1);
        System.out.println(student1.getName());
        System.out.println("Debug");
    }

    private static void fun(int x) {
        x += 10;
    }

    private static void fun2(Student s) {
        System.out.println("fun2");
        s.setName("KK");
    }


    private static void demoConstructor() {
        List<Integer> marks = new ArrayList<>();
        marks.add(57);
        marks.add(83);
        Student student1 = new Student("Akshay", 25, 77, marks);
        // Create a copy of student1
        Student student3 = new Student(student1);

        System.out.println("Debug 1");
        // Change the values of student3
        student3.getGrades().add(90);
        fun2(student3);
        student3.setName("Karan");
        student3.setAge(30);
        System.out.println("Debug 2");
    }

}
