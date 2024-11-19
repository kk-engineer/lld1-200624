package in.itkaran.lld1200624.lld1class10.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {

        //demoPair();
        demoGenericPair();
        //demoGenericMethod();
    }

    private static void demoGenericMethod() {
        Pair p1 = new Pair();
        int x = p1.fun("India", 140);
        System.out.println(x);

        // Static generic method
        // Type Inference
        GenericPair.fun("India");
        GenericPair.fun(140);
        GenericPair.fun(5.0);
        GenericPair.fun(true);

        GenericPair.fun(false);
        GenericPair.<String>fun("USA");

        // Map<String, Integer> map = new HashMap<>();
    }

    private static void demoPair() {
        Pair p1 = new Pair();
        p1.first = 140;
        p1.second = "India";

        String name = (String) p1.first;
        double x = (double) p1.second;
        System.out.println(name);
        System.out.println(x);

    }

    private static void demoGenericPair() {
        GenericPair<String, Integer> p1 = new GenericPair<>();
        p1.setFirst("India");
        p1.setSecond(140);

        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());


        GenericPair<Double, Double> p2 = new GenericPair<>();
        p2.setFirst(20.456);
        p2.setSecond(23.678);

        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());


        // Type Erasure
        System.out.println(p1.getClass().getName());
        System.out.println(p2.getClass().getName());

        // Java collections
        Map<String, Integer> map = new HashMap<>();
        HashMap hm = new HashMap();
        System.out.println(map.getClass().getName());
        System.out.println(hm.getClass().getName());
    }
}
