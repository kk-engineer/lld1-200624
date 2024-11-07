package in.itkaran.lld1200624.lld1class4.inheritance;

public class Animal {

    Animal(String name) {
        System.out.println("Animal " + name);
    }

    public void whoAmI() {
        System.out.println("I am an Animal");
    }

    public void fun() {
        System.out.println("Animal fun");
    }

    public void fun(int i) {
        System.out.println("Animal fun " + i);
    }

    public void fun(String s) {
        System.out.println("Animal fun " + s);
    }

    public void fun(int i, String s) {
        System.out.println("Animal fun " + i + " " + s);
    }

    public void fun(String s, int i) {
        System.out.println("Animal fun " + s + " " + i);
    }

}
