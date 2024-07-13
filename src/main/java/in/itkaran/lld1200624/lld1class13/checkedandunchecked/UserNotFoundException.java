package in.itkaran.lld1200624.lld1class13.checkedandunchecked;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        // Unchecked exception
        super(message);
    }
}
