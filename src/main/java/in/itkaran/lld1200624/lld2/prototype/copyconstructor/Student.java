package in.itkaran.lld1200624.lld2.prototype.copyconstructor;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Integer> marks;

    public Student(String name, int age, List<Integer> marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.marks = student.marks;
    }
}
