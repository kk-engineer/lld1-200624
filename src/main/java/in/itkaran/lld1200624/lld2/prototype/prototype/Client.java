package in.itkaran.lld1200624.lld2.prototype.prototype;


import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        //demoPrototype();
        demoRegistry();
    }

    private static void fillRegistry(StudentRegistry studentRegistry) {
        List<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(90);
        Student st = new Student("Sourabh", 25, marks);
        IntelligentStudent is = new IntelligentStudent("Ajay", 26, marks, 150);
        CreativeStudent cs = new CreativeStudent("Souvik", 27, marks, 250);

        studentRegistry.register(StudentType.STUDENT, st);
        studentRegistry.register(StudentType.INTELLIGENT_STUDENT, is);
        studentRegistry.register(StudentType.CREATIVE_STUDENT, cs);
    }

    private static void demoRegistry() {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);


        Student stPrototype = studentRegistry.get(StudentType.STUDENT);
        Student isPrototype = studentRegistry.get(StudentType.INTELLIGENT_STUDENT);
        Student csPrototype = studentRegistry.get(StudentType.CREATIVE_STUDENT);

        Student stCopy = stPrototype.copy();
        Student isCopy = isPrototype.copy();
        Student csCopy = csPrototype.copy();

        System.out.println("DEBUG");
    }



    private static void demoPrototype() {
        List<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(90);

        Student st1 = new Student("Sourabh", 25, marks);
        Student st1Copy = st1.copy();

        IntelligentStudent is = new IntelligentStudent("Ajay", 26, marks, 150);
        IntelligentStudent isCopy = is.copy();

        CreativeStudent cs = new CreativeStudent("Souvik", 27, marks, 250);
        CreativeStudent csCopy = cs.copy();

        System.out.println("DEBUG");
    }
}
