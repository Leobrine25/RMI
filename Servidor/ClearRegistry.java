import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClearRegistry {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();
            registry.unbind("CalcService");
            //UnicastRemoteObject.unexportObject(registry, true);
            System.out.println("Server Limpo");
        } catch (Exception e) {
            System.out.println(e.toString());
        } 
    }
}
