package in.itkaran.lld1200624.lld2.prototype.copyconstructor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        demoCopyConstructor();
    }

    private static void demoCopyConstructor() {
        List<Student> students = new ArrayList<>();
        List<Student> studentsCopy = new ArrayList<>();

        List<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(80);
        marks.add(92);

        Student st = new Student("Javed", 25, marks);
        Student is = new IntelligentStudent("Souvik", 26, marks, 140);
        Student cs = new CreativeStudent("Tushar", 27,marks, 250);

        students.add(st);
        students.add(is);
        students.add(cs);

        for (Student student : students) {
            Student stCopy = null;
            if (student instanceof IntelligentStudent) {
                IntelligentStudent isCopy = (IntelligentStudent) student;
                stCopy = new IntelligentStudent(isCopy);
            }
            else if (student instanceof CreativeStudent) {
                CreativeStudent csCopy = (CreativeStudent) student;
                stCopy = new CreativeStudent(csCopy);
            }
            else {
                stCopy = new Student(student);
            }
            studentsCopy.add(stCopy);
        }

        Student st2 = st;
        Student st3 = new Student(st);

        marks.add(60);

        System.out.println("DEBUG");
    }
}
