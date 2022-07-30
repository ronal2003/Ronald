import javax.swing.*;
public class Primerclase {
    public static void main(String args[]){
        String nombre= "";
        int edad;
        String numero = "";
        nombre = JOptionPane.showInputDialog("Nombre");

        edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));

        numero =JOptionPane.showInputDialog("Ingres su numero telefonico");

        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "" +
                "\n edad: " + edad + "" +
             "\n Numero de telefono: " + numero);
    }
}
