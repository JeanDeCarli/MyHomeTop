package RMI;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class Controlador{
    private List<Sensor> sensores = new ArrayList<Sensor>();
    private List<Atuador> atuadores = new ArrayList<Atuador>();

    public Controlador() throws RemoteException {
    }

    public List<Sensor> getSensores() throws RemoteException {
        return sensores;
    }

    public void setSensores(List<Sensor> sensores) throws RemoteException {
        this.sensores = sensores;
    }

    public List<Atuador> getAtuadores() throws RemoteException {
        return atuadores;
    }

    public void setAtuadores(List<Atuador> atuadores) throws RemoteException {
        this.atuadores = atuadores;
    }
    
    public void addSensor(String name, String comodo) throws RemoteException {
        this.sensores.add(new Sensor(name, comodo));
        System.out.println("Sensor: " + this.sensores.get(sensores.size()-1).getName() + " - " + this.sensores.get(sensores.size()-1).getComodo());
    }
    
    public void addAtuador(String name, String comodo) throws RemoteException {
        this.atuadores.add(new Atuador(name, comodo));
        System.out.println("Atuador: " + this.atuadores.get(atuadores.size()-1).getName() + " - " + this.atuadores.get(atuadores.size()-1).getComodo());
    }
}
