package Clase1;

import javax.swing.*;

public class libreta {
    String nombre;
    String direccion;
    String telefono;
    int posicionGuardar = 0, posicionBuscar = 0;
    String[][] Libreta = new String[5][3];

    public libreta() {
        Libreta();
    }

    public void Libreta() {


        boolean continuar = true;
        while (continuar) {

            String sms = JOptionPane.showInputDialog("1. guardar contacto\n" +
                    "2. consultar contacto \n " +
                    "3. borrar contacto \n" +
                    "4. salir ");

            switch (sms) {
                case "1":
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    telefono = JOptionPane.showInputDialog("Ingrese el telefono");
                    direccion = JOptionPane.showInputDialog("Ingrese la direccion");
                    posicionGuardar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a guardar"));

                    Libreta[posicionGuardar][0] = nombre;
                    Libreta[posicionGuardar][1] = telefono;
                    Libreta[posicionGuardar][2] = direccion;

                    break;
                case "2":
                    posicionBuscar = Integer.parseInt(JOptionPane.showInputDialog("Diguite la posicion a guardar"));
                    if(Libreta[posicionBuscar][0] == null){
                        JOptionPane.showMessageDialog(null, "No se encontro el contacto verifica si el contacto existe");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nombre " + Libreta[posicionGuardar][0] + "" +
                                "}\n Telefono " + Libreta[posicionBuscar][1] + "\n" +
                                "direccion " + Libreta[posicionBuscar][2]);

                    }
                    break;
                case "3":
                    break;
                case "4":
                    continuar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "porfavor lea bien e ingese una opcion valida");

            }
        }
    }
        public static void main(String[] args) {
new libreta();
        }
}
