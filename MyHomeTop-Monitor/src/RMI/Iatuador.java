package RMI;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Iatuador extends Remote{
    public String getName() throws RemoteException;
    public void setName(String name) throws RemoteException;
    public void setComodo(String comodo) throws RemoteException;
    public String getComodo() throws RemoteException;
    public int getVal() throws RemoteException;
    public void setVal(int val) throws RemoteException;
    public boolean isOn() throws RemoteException;
    public void setOn(boolean on) throws RemoteException;
}
