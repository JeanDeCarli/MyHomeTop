package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Icontrolador extends Remote{
    public List<Isensor> getSensores() throws RemoteException;
    public List<Iatuador> getAtuadores() throws RemoteException;
    public void addSensor(String name, String comodo) throws RemoteException;
    public void addAtuador(String name, String comodo) throws RemoteException;
}
