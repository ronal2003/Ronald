import javax.swing.*;

public class ConversionMP {
    public static void main(String args[]){
        double pie=328084;
        double pulgada=393701;

        double M1 = Double.parseDouble(JOptionPane.showInputDialog("por favor ingrese la cantidad de metros"));

        double calcular = M1 * pie;
        double medida = M1 * pulgada;
        JOptionPane.showMessageDialog(null,"la converrsion de M a pie es: " + calcular);
        JOptionPane.showMessageDialog(null,"la conversion de M a pulgada es: " + medida);
    }
}
