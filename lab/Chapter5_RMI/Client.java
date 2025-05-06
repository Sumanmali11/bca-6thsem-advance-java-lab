import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost"); // or use IP
            Hello stub = (Hello) registry.lookup("Hello");
            String response = stub.sayHello();
            String response2 = stub.sayHi();
            System.out.println("Response from server: " + response);
            System.out.println("Response from server: " + response2);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}