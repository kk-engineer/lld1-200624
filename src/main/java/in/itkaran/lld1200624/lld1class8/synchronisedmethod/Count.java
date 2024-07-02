package in.itkaran.lld1200624.lld1class8.synchronisedmethod;

public class Count {
    int value = 0;

    public synchronized void incrementValue(int offset) {
        //
        //
        this.value += offset;
        //

        //
    }

    public int getValue() {
        return this.value;
    }
}
