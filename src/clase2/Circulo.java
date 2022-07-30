import javax.swing.*;

public class Circulo {
    public static void main(String args[]){

        double radio = 0;
        double area=0;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio de tu circulo"));
        area = Math.PI*radio*radio;
        JOptionPane.showMessageDialog(null, "el area de tu circulo es: " + area);

    }
}
