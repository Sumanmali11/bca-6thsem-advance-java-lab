import java.rmi.*;
import java.rmi.server.*;

public class MathServer extends UnicastRemoteObject implements MathOperations {
    public MathServer() throws RemoteException {}

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    public int subtract(int a, int b) throws RemoteException {
        return a - b;
    }

    public static void main(String[] args) {
        try {
            MathServer server = new MathServer();
            Naming.rebind("MathServer", server);
            System.out.println("MathServer is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
