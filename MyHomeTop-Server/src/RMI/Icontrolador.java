package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Icontrolador extends Remote{
    public List<Sensor> getSensores() throws RemoteException;
    public List<Atuador> getAtuadores() throws RemoteException;
    public void addSensor(String name, String comodo, int val) throws RemoteException;
    public void addAtuador(String name, String comodo, int val, boolean on) throws RemoteException;
    public void atualizaSensor(String name, String comodo, int val) throws RemoteException;
    public void atualizaAtuador(String name, String comodo, int val, boolean ativo) throws RemoteException;
}
