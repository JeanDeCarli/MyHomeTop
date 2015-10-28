/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jean_
 */
public class Main {

    public static void main(String[] args) {
        try {
            Icontrolador controlador = (Icontrolador) Naming.lookup("rmi://localhost:1099/controlador");

            String user = JOptionPane.showInputDialog("Digite o usuario: ");
            String pass = JOptionPane.showInputDialog("Digite o password: ");

            if (controlador.login(user, pass)) {
                
                NewSensor ns = new NewSensor();
                ns.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha invalido");
            }

        } catch (NotBoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
