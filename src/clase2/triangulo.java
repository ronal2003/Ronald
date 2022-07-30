import javax.swing.*;

public class triangulo {
    public static void main(String argas[]){

        double area=0;
        double area1=0;
        double base=0;
        double altura;


        base= Double.parseDouble(JOptionPane.showInputDialog("ingrese la base del triangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del triangulo"));
        area1 = base*altura;
        JOptionPane.showMessageDialog(null, "El area del triangulo es " + area);
    }
}
