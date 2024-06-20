package in.itkaran.lld1200624.lld1class3.anothervillage;

import in.itkaran.lld1200624.lld1class3.village.Family;

public class Client {
    public static void main(String[] args) {

        demoAccess2();
    }

    private static void demoAccess2() {
        Family family = new Family();
        System.out.println(family.publicAttribute);
    }
}
