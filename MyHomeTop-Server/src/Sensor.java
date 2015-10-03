
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Sensor extends UnicastRemoteObject implements Isensor {
    private String name;
    private int val;

    public Sensor() throws RemoteException{
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
