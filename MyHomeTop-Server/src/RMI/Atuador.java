package RMI;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Atuador  extends UnicastRemoteObject implements Iatuador {
    private String name;
    private int val;
    private boolean on;

    public Atuador() throws RemoteException{
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    
}
