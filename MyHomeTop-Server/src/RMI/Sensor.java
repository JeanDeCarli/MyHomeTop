package RMI;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Sensor extends UnicastRemoteObject implements Isensor {
    private String name;
    private String comodo;
    private int val;
    private final Controlador control = new Controlador();


    public Sensor(String name, String comodo) throws RemoteException{
        this.name = name;
        this.comodo = comodo;
    }

    public Sensor() throws RemoteException{
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
    public int getVal() throws RemoteException{
        return val;
    }

    @Override
    public void setVal(int val) throws RemoteException{
        this.val = val;
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
    public void addSensor(String name, String comodo) throws RemoteException{
        this.control.addSensor(name, comodo);
    }
}
