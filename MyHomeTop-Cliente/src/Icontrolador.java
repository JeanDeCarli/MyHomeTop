import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Icontrolador extends Remote{
    public List<Isensor> getSensores()throws RemoteException;
    public void setSensores(List<Isensor> sensores)throws RemoteException;
    public List<Iatuador> getAtuadores()throws RemoteException;
    public void setAtuadores(List<Iatuador> atuadores)throws RemoteException;
}
