import javax.swing.*;

public class AreaTriangulo {
    public static void main(String args[]){

        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primero valor"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer valor"));

        int p = a + b + c /2;
        int area = (int) Math.sqrt (p-a)*(p-b)*(p-c);

        JOptionPane.showMessageDialog(null,"La longitud del triangulo es: " + area);


    }
}
