package in.itkaran.lld1200624.lld1class10.generics;

public class GenericPair <F, S> {
    private F first;
    private S second;

    //    public GenericPair(F first, S second) {
//        this.first = first;
//        this.second = second;
//    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    // Getters
    public F getFirst() {
        return this.first;
    }

    public S getSecond() {
        return this.second;
    }

    public static <T> void fun(T data) {
        System.out.println("Generic Pair Fun");
        System.out.println(data);
    }
}
