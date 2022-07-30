public class ciclos {
    public static void main(String[] args) {
    //ciclo while
    //pintar los numeros del 1 al 10

        boolean noHaterminado = true;

        int numero = 1;
       while(noHaterminado) {
          System.out.println("Numeros " + numero);
          numero = numero + 1;
          if (numero > 10)
          {
              noHaterminado = false;

          }

      }
    }
}
