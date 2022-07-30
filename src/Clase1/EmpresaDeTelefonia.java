import javax.swing.*;

public class EmpresaDeTelefonia {
    public static void main (String args[]){
        double recargo = 0.2;

        int inicial = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor inicial"));
        int fin = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor final"));
        double IN = inicial - 0.2;
        double FN = fin - 0.2;
        JOptionPane.showMessageDialog(null, "valor desc de monto inicial " + IN);
        JOptionPane.showMessageDialog(null, "valor desc final " + FN);

    }
}
