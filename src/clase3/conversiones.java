import javax.swing.*;

public class conversiones {
    public static void main(String args[]){
        double  metros = 1000;
        double centimetros = 100000;
        double milla = 1.609;
        double pie = 3281;
        double yarda=1094;
        double pulgada=39370;
        double milimetro = 1000000;

        double KM = Double.parseDouble(JOptionPane.showInputDialog("por favor ingrese la cantidad de KM"));
        double m = KM * metros;
        double cm = KM * centimetros;
        double mll = KM / milla;
        double P = KM * pie;
        double Y = KM* yarda;
        double p = KM * pulgada;
        double M = KM * milimetro;

        JOptionPane.showMessageDialog(null, "Conversion de KM - metros" + m);
        JOptionPane.showMessageDialog(null, "Conversion de KM - centimetro" + cm);
        JOptionPane.showMessageDialog(null, "Conversion de KM - milla" + mll);
        JOptionPane.showMessageDialog(null, "Conversion de KM - pie" + P);
        JOptionPane.showMessageDialog(null, "Conversion de KM - yarda" + Y);
        JOptionPane.showMessageDialog(null, "Conversion de KM - pulgada" + p);
        JOptionPane.showMessageDialog(null, "Conversion de KM - milimetro" + M);

    }
}
