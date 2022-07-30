import javax.swing.*;

public class Volumencilindro {
    public static void main(String args[]){

        double pi = 3.141592;

        double r = Double.parseDouble(JOptionPane.showInputDialog("Por favor Ingrese el radio"));
        double h = Double.parseDouble(JOptionPane.showInputDialog("Por favor Ingrese la altura "));

        double v =  Math.pow(r,2)*pi*h;
        JOptionPane.showMessageDialog(null, "El volumen del cilindro es " + v);
    }
}
