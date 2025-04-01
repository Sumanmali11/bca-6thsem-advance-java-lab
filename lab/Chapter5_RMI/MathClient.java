import java.rmi.*;

public class MathClient {
    public static void main(String[] args) {
        try {
            MathOperations obj = (MathOperations) Naming.lookup("//localhost/MathServer");
            System.out.println("Addition: " + obj.add(10, 5));
            System.out.println("Subtraction: " + obj.subtract(10, 5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
