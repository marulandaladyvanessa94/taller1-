import javax.swing.*;
import java.util.jar.JarOutputStream;

public class convertir {

    public static void main (String[]args){
        double pesos = Double.parseDouble(JOptionPane.showInputDialog("por favor ingresar pesos"));
        double bolivares = pesos*0.0014;
        JOptionPane.showMessageDialog(null,"valor en bolivares es "+bolivares);



    }
}
