import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ1_App {
	public static void main(String args[]) {
		//recojo la figura que desea el usuario
		String figura = JOptionPane.showInputDialog("Introduce la figura:");
		figura = figura.toLowerCase();//lo pongo en minusculas para evitar fallos
		//compruebo que figura es y realiza las oportunas operaciones
		switch(figura) {
		case "circulo":
			JOptionPane.showMessageDialog(null, "Circulo\nEl area es de "+areaCirculo());
			break;
		case "trinagulo":
			JOptionPane.showMessageDialog(null, "Triangulo\nEl area es de "+areaTriangulo());
			break;
		case "cuadrado":
			JOptionPane.showMessageDialog(null, "Cuadrado\nEl area es de "+areaCuadrado());
			break;
		default:
			JOptionPane.showMessageDialog(null, "Figura erronea");
			break;
		}
	}
//metodo para calcular el area del cuadrado
	private static double areaCuadrado() {
		String value = JOptionPane.showInputDialog("Longitud del lado: ");
		double lado = Double.parseDouble(value);
		
		return lado*lado;
		
	}
//metodo para calcular el area del triangulo
	private static double areaTriangulo() {
		String value = JOptionPane.showInputDialog("Altura: ");
		double alto = Double.parseDouble(value);
		
		String value2 = JOptionPane.showInputDialog("Base: ");
		double base = Double.parseDouble(value2);
		
		return (base*alto)/2;
		
	}
//metodo para calcular el area del circulo
	private static double areaCirculo() {
		String value = JOptionPane.showInputDialog("Longitud del radio: ");
		double radio = Double.parseDouble(value);
		
		return Math.PI*(Math.pow(radio, 2));
	}
}
