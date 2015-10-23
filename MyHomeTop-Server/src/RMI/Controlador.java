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
        JOptionPane.showMessageDialog(null, "server - sensor -- " + this.sensores);
        return sensores;
    }

    @Override
    public List<Atuador> getAtuadores() throws RemoteException {
        JOptionPane.showMessageDialog(null, "server - atuador -- " + this.atuadores);
        return atuadores;
    }

    @Override
    public void addSensor(String name, String comodo) throws RemoteException {
        this.sensores.add(new Sensor(name, comodo));
        System.out.println("Sensor: " + this.sensores.get(sensores.size()-1).getName() + " - " + this.sensores.get(sensores.size()-1).getComodo());
    }
    
    @Override
    public void addAtuador(String name, String comodo) throws RemoteException {
        this.atuadores.add(new Atuador(name, comodo));
        System.out.println("Atuador: " + this.atuadores.get(atuadores.size()-1).getName() + " - " + this.atuadores.get(atuadores.size()-1).getComodo());
    }
}
