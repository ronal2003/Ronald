import javax.swing.*;

public class descuentos {



	public static void main(String[] args) {
		
		int desc_segurosoc=4;
		int desc_pension=5;
		int ahorro=7;
		int pago=50000;

		int porcentaje = 4 * 5;
		int descenpago = pago - porcentaje;

		int porcentajedesc = 5 * 5;
		int descenpago1 = pago - porcentajedesc;

		int desc = 7 * 5;
		int descpago = pago - desc;

      String sms ="monto de descuento y de pago\n\n";
	  sms +="el monto del 4% " + porcentaje + "" + "" +
			  "\n monto de pago " + descenpago ;
	  sms +="el monto del 5% es " + porcentajedesc + "" +
			  "\n descuento en el pago de: " + descenpago;
	  sms +="el monto del pago es de: " + desc + "" +
			  "\n descuento alpago: " + descpago;
		JOptionPane.showMessageDialog(null, sms);


	}

}
