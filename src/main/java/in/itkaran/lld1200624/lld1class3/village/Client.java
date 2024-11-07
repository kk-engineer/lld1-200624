package in.itkaran.lld1200624.lld1class3.village;

public class Client {
    public static void main(String[] args) {
        demoAccess();
    }

    private static void demoAccess() {
        Family family = new Family();
        System.out.println(family.defaultAttribute);
        System.out.println(family.protectedAttribute);
        System.out.println(family.publicAttribute);
        //System.out.println(family.privateAttribute);
    }

}
