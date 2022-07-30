import javax.swing.*;

public class datos {
    String dato[] = new String[2];
    int numero[] = new int[221];

    public datos() {
        pedirdatos();
        buscar();
    }

    public void pedirdatos() {
        for (int i = 0; i < dato.length; i++) {
            dato[i] = JOptionPane.showInputDialog("Ingrese un nombre ");
            dato[i] = JOptionPane.showInputDialog("Ingrese su edad");
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su saldo"));
        }
    }
    public void buscar(){
        int buscar;
        buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de buscar"));
        for(int i=0; i<dato.length; i++){
            if(numero[i] == buscar){
                System.out.println("Numero encontrado " + numero[i]);
            } else {
                System.out.println("No se encontro el dato");
            }
        }
    }


    public static void main(String[] args) {
        new datos();
    }
}
