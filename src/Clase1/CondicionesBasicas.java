import javax.swing.*;

public class CondicionesBasicas {

    public void CondicionalesBasicas(){
       edad();
    }
    public void edad(){
        int  edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

       if(edad >=18){
            JOptionPane.showMessageDialog(null, "usted es mayor de edad");
            edad();
        }else{
            JOptionPane.showMessageDialog(null, "usted no es mayor de edad");
            edad();
        }
    }
    public void NombreYNumero(String nombre, String numero){
        nombre = JOptionPane.showInputDialog("Digite su nombre ");
        int Numero = Integer.parseInt(JOptionPane.showInputDialog("digite su numero"));

        JOptionPane.showMessageDialog(null, nombre + Numero);

    }
    public static void main(String args[]){
        new CondicionesBasicas();
    }
}
