import javax.swing.JOptionPane;

public class mayorypromedio {
	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese los numeros.."));
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese los numeros.."));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese los numeros.."));

		if (numero > numero1) {
			JOptionPane.showMessageDialog(null, "1 diguito Mayor: " + numero);

		} else {
			JOptionPane.showMessageDialog(null, "2 diguito Menor: " + numero);
		}

		if (numero < numero2) {
			JOptionPane.showMessageDialog(null, "3 diguito Mayor: " + numero);
		} else {
			JOptionPane.showMessageDialog(null, "4 diguito Menor: " + numero);
		}

	}
}
