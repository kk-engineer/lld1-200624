package in.itkaran.lld1200624.lld1class13.checkedandunchecked;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message) {
        // Checked - compile time
        super(message);
    }
}
