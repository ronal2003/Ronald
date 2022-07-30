import javax.swing.JOptionPane;

public class descuentosaldo {

	public static void main(String[] args) {
		double pago=30000;
		double descuento =5;

		double monto = 3 * 5;
		double montototal = pago - monto;
		JOptionPane.showMessageDialog(null, "El monto del descuento son: " + monto);
		JOptionPane.showMessageDialog(null, "El monto de total a pagar es: " + montototal);

	}
// en todos los ejercicios de hallar porcentajes yo hice el calculo multiñicando el numero del porcentaje con el primer
// numero del valor de los pagos es resultado luego lo restaba con el valor de pago
}
