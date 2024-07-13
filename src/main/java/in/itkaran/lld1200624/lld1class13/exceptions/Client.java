package in.itkaran.lld1200624.lld1class13.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        //demoDivideByZeroException(new Scanner(System.in));
//        try {
//            demoFileException();
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("FNFE " + e.getMessage());
//        }
//        catch (IOException e) {
//            System.out.println("IOE" + e.getMessage());
//        }

        demoTryCatch();
    }

    private static void demoTryCatch() {
        try {
//            System.out.println("Try block");
//            File file = new File("abc.txt");
//            FileReader fileReader = new FileReader(file);
//            fileReader.read();

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a/b);
            System.exit(-1);
            return;
        }

//        catch (FileNotFoundException e) {
//            System.out.println("FileNotFoundException " + e.getMessage());
//        }
//        catch (IOException e) {
//            System.out.println("IOException " + e.getMessage());
//        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException " + e.getMessage());
        }
        catch (NullPointerException abc) {
            System.out.println("NullPointerException " + abc.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }
        finally {
            System.out.println("Finally block");
            System.out.println("Finally: Some more business logic of cleaning resources here, e.g DB connection , network connection etc");
            fun();
        }

        System.out.println("After: Some more business logic here #2");
        fun();
        System.out.println("After Try Catch and Finally");
    }

    public static void fun() {
        System.out.println("Fun");
    }

    private static void demoFileException() throws FileNotFoundException, IOException {
        File file = new File("abc.txt");
//        if (!file.exists()) {
//            throw new FileNotFoundException();
//        }
        FileReader fileReader = new FileReader(file);
        fileReader.read();
    }

    private static void demoDivideByZeroException(Scanner scanner) {
        //scanner = null;
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a/b);
    }


}
