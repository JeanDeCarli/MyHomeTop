package RMI;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {

    public static void main(String[] args) {
        try {
            Isensor sensor = new Sensor();
            Iatuador atuador = new Atuador();
            Icontrolador controlador = new Controlador();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("atuador", atuador);
            Naming.rebind("sensor", sensor);
            Naming.rebind("controlador", controlador);
        } catch (RemoteException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
