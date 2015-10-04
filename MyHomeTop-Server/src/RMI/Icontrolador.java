package RMI;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Icontrolador extends Remote{
    public List<Sensor> getSensores()throws RemoteException;
    public void setSensores(List<Sensor> sensores)throws RemoteException;
    public List<Atuador> getAtuadores()throws RemoteException;
    public void setAtuadores(List<Atuador> atuadores)throws RemoteException;
    public void addSensor(Sensor s)throws RemoteException;
    public void addAtuador(Atuador a)throws RemoteException;
}