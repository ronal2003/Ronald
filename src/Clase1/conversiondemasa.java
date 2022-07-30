import javax.swing.*;

 public class conversiondemasa {
    public static void main (String args[]){
        int kg = 1000;
        int quintales = 10;
        int gr = 1000000;
        int Lb = 2205;

        int Ton = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cant de toneladas"));

        int KG = Ton * kg;
        int qtl = Ton * quintales;
        int GR = Ton * gr;
        int LB = Ton * Lb;

        JOptionPane.showMessageDialog(null, "la conversion de Ton a - kg es: " + KG);
        JOptionPane.showMessageDialog(null, "la conversion de Ton a - quintales es: " + qtl);
        JOptionPane.showMessageDialog(null, "la conversion de Ton a - gramos es: " + GR);
        JOptionPane.showMessageDialog(null, "la conversion de Ton a - Libras es: " + LB);

    }
}
