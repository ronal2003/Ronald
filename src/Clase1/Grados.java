import javax.swing.*;

public class Grados {
    public static void main(String[] args){

        int C = Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese la cant de °C"));
        int F = (C * 9/5) +32;
        JOptionPane.showMessageDialog(null, "Fahrenheit: " + F +"°");
    }
}
