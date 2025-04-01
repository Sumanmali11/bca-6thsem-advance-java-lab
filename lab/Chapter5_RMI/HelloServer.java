import java.rmi.*;
import java.rmi.server.*;

public class HelloServer extends UnicastRemoteObject implements Hello {
    public HelloServer() throws RemoteException {}

    public String sayHello(String name) throws RemoteException {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        try {
            HelloServer server = new HelloServer();
            Naming.rebind("HelloServer", server);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
