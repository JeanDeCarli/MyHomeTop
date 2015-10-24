package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Controlador extends UnicastRemoteObject implements Icontrolador{
    private final List<Sensor> sensores = new ArrayList<>();
    private final List<Atuador> atuadores = new ArrayList<>();

    public Controlador() throws RemoteException {
    }

    @Override
    public List<Sensor> getSensores() throws RemoteException {
        return sensores;
    }

    @Override
    public List<Atuador> getAtuadores() throws RemoteException {
        return atuadores;
    }

    @Override
    public void addSensor(String name, String comodo, int val) throws RemoteException {
        this.sensores.add(new Sensor(name, comodo, val));
    }
    
    @Override
    public void addAtuador(String name, String comodo, int val, boolean on) throws RemoteException {
        this.atuadores.add(new Atuador(name, comodo, val, on));
    }
    
    @Override
    public void atualizaSensor(String name, String comodo, int val) throws RemoteException {
        for (Sensor sensore : this.sensores) {
            if (sensore.getName().equalsIgnoreCase(name) && sensore.getComodo().equalsIgnoreCase(comodo)) {
                sensore.setVal(val);
            }
        }
    }
    
    @Override
    public void atualizaAtuador(String name, String comodo, int val) throws RemoteException {
        for (Atuador atuadore : this.atuadores) {
            if (atuadore.getName().equalsIgnoreCase(name) && atuadore.getComodo().equalsIgnoreCase(comodo)) {
                atuadore.setVal(val);
            }
        }
    }
}
