
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Controlador extends UnicastRemoteObject implements Icontrolador{
    private List<Sensor> sensores = new ArrayList<Sensor>();
    private List<Atuador> atuadores = new ArrayList<Atuador>();

    public Controlador() throws RemoteException{
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public List<Atuador> getAtuadores() {
        return atuadores;
    }

    public void setAtuadores(List<Atuador> atuadores) {
        this.atuadores = atuadores;
    }
}
