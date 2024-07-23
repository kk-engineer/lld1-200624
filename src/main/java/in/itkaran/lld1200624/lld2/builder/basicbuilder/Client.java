package in.itkaran.lld1200624.lld2.builder.basicbuilder;

public class Client {
    public static void main(String[] args) {
        Helper builder = new Helper();
        builder.setName("Satya");
        builder.setAge(25);
        builder.setGradYear(2024);
        builder.setPsp(75.0);
        Student st = new Student(builder);
        System.out.println("Debug");
    }
}
