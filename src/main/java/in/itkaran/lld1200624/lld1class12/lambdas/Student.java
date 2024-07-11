package in.itkaran.lld1200624.lld1class12.lambdas;

public class Student {
    public String name;
    public int marks;
    public int rollNum;

    public Student(String name, int marks, int rollNum) {
        this.name = name;
        this.marks = marks;
        this.rollNum = rollNum;
    }

    public String toString() {
        return "[name=" + name + ", marks=" + marks + ", rollNum=" + rollNum + "]";
    }
}
