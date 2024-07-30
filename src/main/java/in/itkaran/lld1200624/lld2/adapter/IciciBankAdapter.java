package in.itkaran.lld1200624.lld2.adapter;

import in.itkaran.lld1200624.lld2.adapter.thirdparty.icicibank.IciciBank;

public class IciciBankAdapter implements BankApi {
    private IciciBank iciciBank = new IciciBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBank.makePayment(amount, to, from);
    }

    @Override
    public void registerUser(String accountNumber) {

    }

    @Override
    public void checkBalance(String accountNumber) {

    }
}
