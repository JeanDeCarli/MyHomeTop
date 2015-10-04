package RMI;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Controlador extends UnicastRemoteObject implements Icontrolador{
    private List<Sensor> sensores = new ArrayList<Sensor>();
    private List<Atuador> atuadores = new ArrayList<Atuador>();

    public Controlador() throws RemoteException{
    }

    @Override
    public List<Sensor> getSensores()  throws RemoteException{
        return sensores;
    }

    @Override
    public void setSensores(List<Sensor> sensores)  throws RemoteException{
        this.sensores = sensores;
    }

    @Override
    public List<Atuador> getAtuadores()  throws RemoteException{
        return atuadores;
    }

    @Override
    public void setAtuadores(List<Atuador> atuadores)  throws RemoteException{
        this.atuadores = atuadores;
    }
    
    @Override
    public void addSensor(Sensor s) throws RemoteException{
        this.sensores.add(s);
        System.out.println(this.sensores.size());
    }
    
    @Override
    public void addAtuador(Atuador a) throws RemoteException{
        this.atuadores.add(a);
        System.out.println(this.atuadores.size());
    }
}
