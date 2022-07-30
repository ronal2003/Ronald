import javax.swing.*;

public class Exprecion_A {

	public Exprecion_A() {
		menu();

	}

	public void menu() {
		String sms = "Ingrse una opcion\n\n";

		sms += "1. exprecion a\n";
		sms += "2. exprecion b\n";
		sms += "3. exprecion c\n";
		sms += "4. exprecion d\n";
		sms += "5. exprecion e\n";
		sms += "6. exprecion f\n";

		String entrada = JOptionPane.showInputDialog(sms);

		switch (entrada) {
		case "1":
			Exprecion_a();
			break;
		case "2":
			Exprecion_b();
			break;
		case "3":
			Exprecion_c();
			break;
		case "4":
			Exprecion_d();
			break;
		case "5":
			Exprecion_e();
			break;
		case "6":
			Exprecion_f();
			break;
		}
	}

	public void Exprecion_a() {

		int a = Integer.parseInt(JOptionPane.showInputDialog("por favor Ingrese la primer exprecion"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("por favor Ingrese la segunda ecprecion"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Por favor Ingrese la tecera expresion"));
		int d = Integer.parseInt(JOptionPane.showInputDialog("Por favor Ingrese la cuarta y ultima expresion"));

		int calcular = a - b;
		int calculo = c - d;
		int total = calcular / calculo;

		JOptionPane.showMessageDialog(null, "El resultado de tu exprecion es: " + total);

	}

	public void Exprecion_b() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("por favor Ingrese la primer exprecion"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("por favor Ingrese la segunda ecprecion"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Por favor Ingrese la tecera expresion"));

		int calcular = (int) Math.pow(b, 2) + a / c;

		JOptionPane.showMessageDialog(null, "el resultado de tu segunda exprecion es: " + calcular);

	}

	private void Exprecion_c() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("por favor Ingrese la primer exprecion"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("por favor Ingrese la segunda ecprecion"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Por favor Ingrese la tecera expresion"));

		int calculo = (int) Math.pow(a, 2 + b);
		int calcular = (int) Math.pow(b, 2) - c;

		JOptionPane.showMessageDialog(null, "El resultado de tu tercera expresion es: " + calcular);

	}

	private void Exprecion_d() {
		int numero =5;
		int x = Integer.parseInt(JOptionPane.showInputDialog("Dale un valor a X"));
		
		int resultado = (int) Math.pow(x, 2) - 3 + 5;
	 JOptionPane.showMessageDialog(null, "El resultado de tu exprecion es: " + resultado);
	}

	private void Exprecion_e() {
	
		int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para hallar la suma de la raiz cuadrada"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para hallar la suma de la raiz cuadrada"));
		
		int raiz = (int) Math.sqrt(a) + b;
		 JOptionPane.showMessageDialog(null, "El resultado de tu exprecion es: " + raiz);
			
		

	}

	private void Exprecion_f() {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a"));
		 int b = (int) Math.pow(a, 10 ) - 5;
		 JOptionPane.showMessageDialog(null, "El resultado de tu exprecion es: " + b);
			
	}

	public static void main(String args[]) {
		new Exprecion_A();
	}
}
