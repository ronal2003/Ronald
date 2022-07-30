import javax.swing.JOptionPane;

public class Beca {

	public static void main(String[] args) {

    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
		double matematicas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la nota de la primer materia"));
		double biologia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota de la segunda materia"));
		double fisica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota de la tercer materia"));
		double quimica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota de la tercer materia"));
		
		
		double promedio = (matematicas + biologia + fisica + quimica)/4;
		
		if(promedio > 45) {
			JOptionPane.showMessageDialog(null, "el alumno "+nombre+"tiene derecho a la beca por su buen promedio " + promedio);

		}else {
			JOptionPane.showMessageDialog(null, "el alumno "+nombre+" no podra acceder a la beca por su bajo promedio " + promedio);
			
		}
	}

}
