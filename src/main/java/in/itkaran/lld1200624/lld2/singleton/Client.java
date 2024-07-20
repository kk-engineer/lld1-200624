package in.itkaran.lld1200624.lld2.singleton;

import javax.xml.crypto.Data;

public class Client {
    public static void main(String[] args) {
        demoSingleton();
    }

    private static void demoSingleton() {
        //DatabaseConnection databaseConnection = new DatabaseConnection();
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection3 = DatabaseConnection.getInstance();

        System.out.println("DEBUG");
    }
}
