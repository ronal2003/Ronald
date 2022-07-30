import javax.swing.JOptionPane;
public class Condicionales {

public Condicionales(){

}
     public void edad(){
         int  edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

         if(edad >=18){
             JOptionPane.showMessageDialog(null, "usted es mayor de edad");
edad();
         }else{
             JOptionPane.showMessageDialog(null, "usted no es mayor de edad");
             edad();
     }


            }
    public static void main(String args[]){
new Condicionales();
    }
}
