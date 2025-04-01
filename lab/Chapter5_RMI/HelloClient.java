import java.rmi.*;

public class HelloClient {
    public static void main(String[] args) {
        try {
            Hello obj = (Hello) Naming.lookup("//localhost/HelloServer");
            String response = obj.sayHello("World");
            System.out.println("Response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
