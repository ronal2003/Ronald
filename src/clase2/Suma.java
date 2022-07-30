import javax.swing.*;

public class Suma {
    public static void main(String args[]) {

        int PrimerNUmero = 0;
        int SegundoNumero = 0;

        PrimerNUmero = Integer.parseInt(JOptionPane.showInputDialog("Digite su primer numero"));
        int suma = PrimerNUmero + SegundoNumero;
        JOptionPane.showMessageDialog(null,"El resultado de tu suma es: " + suma);
    }
}
