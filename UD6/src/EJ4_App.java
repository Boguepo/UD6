import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ4_App {
	public static void main(String args[]) {
		String value = JOptionPane.showInputDialog("Introduce el numero");
		int num = Integer.parseInt(value);
		
		calcularFactorial(num);
	}

	private static void calcularFactorial(int num) {
		int resultado = 1;//Lo iniciamos a 1 porque sino el resultado siempre seria 0
		for (int j = 1; j <=num ; j++) {
			resultado = resultado * j;
		}
		
		JOptionPane.showMessageDialog(null, "Elvalor factorial es de "+resultado);
	}
}
