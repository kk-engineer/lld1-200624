package in.itkaran.lld1200624.lld1class13.finalize;

import java.sql.SQLOutput;

public class Student {
    public void finalize() throws Throwable {
        System.out.println("finalize");
        System.out.println("Free more resources such as DB connection etc");
    }

    public static void main(String[] args) throws Throwable {
        Student s = new Student();
        s.finalize();
        // set the object null for garbage collection
        s = null;
        System.gc();    // will call finalize method of the class implicitly.
    }
}


