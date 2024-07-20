package in.itkaran.lld1200624.lld2.singleton.multithreaded;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String url;
    private String username;
    private String password;

    // Make constructor private
    private DatabaseConnection() {

    }

    public static DatabaseConnection getInstance() {
        System.out.println("Check if instance is available " + Thread.currentThread().getName());
        if (instance == null) {
            System.out.println("Instance NOT available " + Thread.currentThread().getName());
            synchronized (in.itkaran.lld1200624.lld2.singleton.DatabaseConnection.class) {
                System.out.println("Double check lock " + Thread.currentThread().getName());
                if (instance == null) {
                    System.out.println("Creating Singleton instance " + Thread.currentThread().getName());
                    instance = new DatabaseConnection();
                }
            }
        }
        System.out.println("Returning Singleton instance " + Thread.currentThread().getName());
        return instance;
    }
}
