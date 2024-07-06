package in.itkaran.lld1200624.lld1class10.generics;

public class Pair {
    Object first;
    Object second;

    public <T, X> X fun(T data, X data2) {
        System.out.println(data);
        return data2;
    }
}
