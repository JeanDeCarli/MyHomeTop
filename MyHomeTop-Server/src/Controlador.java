
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
    public List<Sensor> getSensores() {
        return sensores;
    }

    @Override
    public void setSensores(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    @Override
    public List<Atuador> getAtuadores() {
        return atuadores;
    }

    @Override
    public void setAtuadores(List<Atuador> atuadores) {
        this.atuadores = atuadores;
    }
    
    @Override
    public void addSensor(){
        
    }
    
    @Override
    public void addControlador(){
        
    }
}
