import javax.swing.*;

public class conversiontiempo {
    public static void main(String args[]){
        int segundos = 83242;

        //int S = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cant en segundos"));

        int horas = segundos / 3600;
        segundos %= 3600;
        int minuto = segundos / 60;
        segundos %= 60;


        String sms = "Conv H M S \n\n";
        sms += "Hora " + horas + "\n";
        sms += "Minuto " + minuto + "\n";
        sms += "segundo " + segundos + "\n";
        JOptionPane.showMessageDialog(null,sms);

    }
}
