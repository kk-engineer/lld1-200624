package in.itkaran.lld1200624.lld2.prototype.copyconstructor;

import java.util.List;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(String name, int age, List<Integer> marks, int iq) {
        super(name, age, marks);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent student) {
        // Copy constructor of parent called
        super(student);
        this.iq = student.iq;
    }
}
