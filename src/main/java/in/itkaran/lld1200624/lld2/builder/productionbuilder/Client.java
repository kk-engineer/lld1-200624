package in.itkaran.lld1200624.lld2.builder.productionbuilder;

public class Client {
    public static void main(String[] args) {
        Student.Helper builder = Student.getBuilder();
        builder.setName("Satya");
        builder.setAge(25);
        builder.setGradYear(2024);
        builder.setPsp(75.0);
        Student s1 = builder.build();
        System.out.println("Debug");

        Student s2 = Student.getBuilder().setName("Akshay").setAge(25).setGradYear(2024).setPsp(70.0).build();
        Student s3 = Student.getBuilder().setName("Ajay").setAge(27).build();
        System.out.println("Debug");
    }
}
