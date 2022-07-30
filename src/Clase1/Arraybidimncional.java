package Clase1;

import org.w3c.dom.css.CSSUnknownRule;

import javax.swing.*;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Arraybidimncional {
    Scanner entrada = new Scanner(System.in);
    public Arraybidimncional() {
        Arreglo_2();
        //Arreglo();
    }

    public void Arreglo() {
        int[][] numeros = new int[3][4];
    //primero ban las filas despues las columas
    //

        int num;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) Math.floor(Math.random() * (9 - 1));
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void Arreglo_2(){

        String[][] nombres = {{"laura","diego","paola","frank"},
                             {"melany","santiago","jose","kate"},
                             {"isabela","caren","ronal","mallerly"}};

        int numeros;
        System.out.println("\nNombres de alumnos");

        for(int i=0; i<nombres.length; i++){
            for(int j=0; j<nombres[i].length; j++){
                System.out.print(nombres[i][j] + ", ");
            }
            System.out.println("");
        }
        // numero aleatorio del arreglo
        for(int i=0; i<nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                int filas = ((int) Math.floor(Math.random() * (2 - 0)));
                int columna = ((int) Math.floor(Math.random() * (3 - 0)));

                JOptionPane.showMessageDialog(null, "Felizidades a ganado una exposicion " + nombres[filas][columna]);

            }
        }
    }


    public static void main(String[] args) {
        new Arraybidimncional();
    }
}


