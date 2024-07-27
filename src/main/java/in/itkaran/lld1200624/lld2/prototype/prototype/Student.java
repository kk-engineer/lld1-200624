package in.itkaran.lld1200624.lld2.prototype.prototype;

import java.util.List;

public class Student implements Prototype<Student> {
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

    @Override
    public Student copy() {
        return new Student(this);
    }
}
