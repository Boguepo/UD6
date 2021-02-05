import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ3_App {
	public static void main(String args[]) {
		String value = JOptionPane.showInputDialog("Introduce un numero:");
		int num = Integer.parseInt(value);
		
		boolean primo = esPrimo(num);
		
		if(primo) {
			JOptionPane.showMessageDialog(null,"El numero es primo");
		}else {
			JOptionPane.showMessageDialog(null, "El numero no es primo");
		}
		
	}

	private static boolean esPrimo(int num) {
		int contador = 2; //lo incio en 2 porque todos los primos son divisibles entre 1
		boolean primo = true;
		
		while(primo && (contador!=num)) {//mientras sigasiendo primo y el contador no sea igual al numero
			if(num%contador==0) {
				primo = false;
			}
			contador++;
		}
		
		return primo;
		
	}
}
