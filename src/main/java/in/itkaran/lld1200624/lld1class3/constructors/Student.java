package in.itkaran.lld1200624.lld1class3.constructors;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Student {
    private String name;
    private int age;
    private double psp;
    private List<Integer> grades;

    public Student(String name, int age, double psp, List<Integer> grades) {
        // Object created with default values
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.grades = grades;
    }

    public Student() {
        // do noting
    }

    // copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.psp = s.psp;
        this.grades = s.grades;
    }
}
