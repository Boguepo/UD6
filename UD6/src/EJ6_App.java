import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ6_App {
	public static void main (String args[]) {
		String valNum = JOptionPane.showInputDialog("Introduce un numero: ");
		int num = Integer.parseInt(valNum);
		//si el numero es 0 o negativo saldra el mensaje de error
		if(num>0) {
			contarNumeros(valNum);
		}else {
			JOptionPane.showMessageDialog(null, "El numero no es positivo");
		}
	}

	private static void contarNumeros(String valNum) {
		JOptionPane.showMessageDialog(null, "El numero "+valNum+" tiene "+valNum.length()+" digitos");
		//el ejercicio pide que se devuelva el valor de digitos pero me parece mas optimo hacelo de esta forma
	}
}
