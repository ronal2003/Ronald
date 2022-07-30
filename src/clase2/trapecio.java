import javax.swing.*;
public class trapecio {
    public static void main(String args[]){
        double basemayor;
        double basemenor;
        double calcular;

        basemayor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida de la base mayor"));
        basemenor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida de la base menor"));
        calcular = basemayor*basemenor/2;
        JOptionPane.showMessageDialog(null, "el area de la base del trapecio: " + calcular);
    }
}
