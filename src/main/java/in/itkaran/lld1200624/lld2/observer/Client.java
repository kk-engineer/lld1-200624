package in.itkaran.lld1200624.lld2.observer;

public class Client {
    public static void main(String[] args) {

        demoObserverPattern();
    }

    private static void demoObserverPattern() {

        Amazon amazon = new Amazon();
        Subscriber inventoryService = new InventoryService();
        Subscriber logisticService = new LogisticService();
        Subscriber emailService = new EmailService();
        Subscriber smsService = new SmsService();

        // subscribe for notifications
        amazon.subscribe(inventoryService);
        amazon.subscribe(logisticService);
        amazon.subscribe(emailService);
        // add 1 more subscriber
        amazon.subscribe(smsService);

        // notify all subscribers
        amazon.orderPlaced();
    }
}
