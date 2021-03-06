package RMI;


import java.awt.SystemColor;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Atuador  extends UnicastRemoteObject implements Iatuador {
    private String name;
    private String comodo;
    private int val;
    private boolean on;
    private final Controlador control = new Controlador();

    public Atuador(String name, String comodo, int val, boolean on) throws RemoteException{
        this.name = name;
        this.comodo = comodo;
        this.val = val;
        this.on = on;
    }

    public Atuador() throws RemoteException{
    }

    @Override
    public String getComodo() throws RemoteException{
        return comodo;
    }

    @Override
    public void setComodo(String comodo) throws RemoteException{
        this.comodo = comodo;
    }

    @Override
    public String getName() throws RemoteException{
        return name;
    }

    @Override
    public void setName(String name) throws RemoteException{
        this.name = name;
    }

    @Override
    public int getVal() throws RemoteException{
        return val;
    }

    @Override
    public void setVal(int val) throws RemoteException{
        this.val = val;
    }

    @Override
    public boolean isOn() throws RemoteException{
        return on;
    }

    @Override
    public void setOn(boolean on) throws RemoteException{
        this.on = on;
    }
}
