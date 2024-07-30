package in.itkaran.lld1200624.lld2.adapter;

public interface BankApi {
    void sendMoney(String from, String to, int amount);
    void registerUser(String accountNumber);
    void checkBalance(String accountNumber);
}
