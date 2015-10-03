
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Servidor {
    public static void main(String[] args) {
        try {
            System.out.println("Iniciando...");
            Isensor sensor = new Sensor();
            Iatuador atuador = new Atuador();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("Atuador", atuador);
            Naming.rebind("Sensor", sensor);
        } catch (RemoteException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
