package in.itkaran.lld1200624.lld2.prototype.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<StudentType, Student> map = new HashMap<>();

    public void register(StudentType studentType, Student student) {
        map.put(studentType, student);
    }

    public Student get(StudentType studentType) {
        return map.get(studentType);
    }
}
