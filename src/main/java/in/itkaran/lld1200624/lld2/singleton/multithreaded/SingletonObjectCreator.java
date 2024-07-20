package in.itkaran.lld1200624.lld2.singleton.multithreaded;

public class SingletonObjectCreator implements Runnable{

    public void run() {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    }
}
