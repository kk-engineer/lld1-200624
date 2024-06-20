package in.itkaran.lld1200624.lld1class3.constructors;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //demoConstructor();
        demoPassByValue();
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
        s.setName("Souvik");
    }



    private static void demoConstructor() {
        List<Integer> marks = new ArrayList<>();
        marks.add(57);
        marks.add(83);
        Student student1 = new Student("Akshay", 25, 77, marks);
        //Student student2 = new Student();
        // Create a copy of student1
        Student student3 = new Student(student1);
        //Student student4 = new Student(student2);

        marks.add(90);
        student3.setName("Javed");
        System.out.println("Debug");
    }

    // Break till 8:40 am
}
