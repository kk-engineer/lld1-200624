package in.itkaran.lld1200624.lld2.prototype.clone;

public class Client {
    public static void main(String[] args) {

        try {
            demoClone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void demoClone() throws CloneNotSupportedException {
        Student st = new Student("Satya", 25);
        Student stCopy = (Student) st.clone();

        System.out.printf("DEBUG");
    }
}
