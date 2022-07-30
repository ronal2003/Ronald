import javax.swing.JOptionPane;

public class pesosbolivares {

    public static void main(String[] args){
        double bolivares = 0.0014;
        int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cantidad en pesos para la conversion"));

        double resultado = peso * bolivares;

        String sms = "conversion\n\n ";
        sms += "peso colombiano " + peso + "\n";
        sms += "bolivar venezolano " + resultado;
     JOptionPane.showMessageDialog(null, sms);

    }
}
