import javax.swing.*;
public class Cuadrado {
    public static void main(String args[]){

        double lado;
        double area;

        lado = Double.parseDouble(JOptionPane.showInputDialog("Diguite el lado del cuadrado"));
        area = lado*lado;
        JOptionPane.showMessageDialog(null, "El perimetro de su cuadrado es: " + area);

    }



}
