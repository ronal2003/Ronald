public class TercerEjercicio {
    public static void main(String[] args) {

        // imprimir de 1 -d hasta 100 -l

        int num = 0;

        while(num < 100)
        {
            num = num + 1;
            if(num%2 ==0)
            {
                System.out.println(num + "-" + "L");
            } else
            {
                System.out.println(num + "-" + "d");

            }
        }
    }
}
