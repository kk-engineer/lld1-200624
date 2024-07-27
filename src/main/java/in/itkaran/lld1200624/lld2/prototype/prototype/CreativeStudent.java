package in.itkaran.lld1200624.lld2.prototype.prototype;

import java.util.List;

public class CreativeStudent extends Student {
    private int cq;

    public CreativeStudent(String name, int age, List<Integer> marks, int cq) {
        super(name, age, marks);
        this.cq = cq;
    }

    public CreativeStudent(CreativeStudent student) {
        // Copy constructor of parent called
        super(student);
        this.cq = student.cq;
    }

    public CreativeStudent copy() {
        return new CreativeStudent(this);
    }
}
