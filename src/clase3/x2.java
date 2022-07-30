import javax.swing.*;

public class x2 {
    double a = 0;
    double b = 0;
    double c = 0;

    double x1 = 0;

    double x2 = 0;


    public x2(){
        FormulaCuadrantica();
    }
    public void FormulaCuadrantica(){
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a...."));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de b...."));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de c...."));
        double formula =(Math.pow(b,2)-4*a*b);
        x1 = (-b +Math.sqrt(formula))/(2*a);
        x2 = (-b -Math.sqrt(formula))/(2*a);
        if(formula<0){
            JOptionPane.showMessageDialog(null, "El resultado tiene diversas soluciones....");

        } else {
            JOptionPane.showMessageDialog(null,"x1: " + x1);
            JOptionPane.showMessageDialog(null,"x2: " +x2);
        }




    }

    public static void main(String args[]){
new x2();
    }
}
