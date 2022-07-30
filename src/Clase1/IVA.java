import javax.swing.*;

public class IVA {
    public static void main(String args[]){
        int IVA = 320;
        int Valor = Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el valor de un producto"));
        int V = Valor + IVA;
        JOptionPane.showMessageDialog(null, "Iva : " + IVA + "Mas el valor ingresado " + V);
    }
}
// en todos los ejercicios de hallar porcentajes yo hice el calculo multiñicando el numero del porcentaje con el primer
// numero del valor de los pagos es resultado luego lo restaba con el valor de pago