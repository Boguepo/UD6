import java.util.Random;

import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ9_App {
	public static void main(String args[]) {
		String value = JOptionPane.showInputDialog("Cuantos valores quieres introducir?");
		int indice = Integer.parseInt(value);
		final int random = 10; //lo declaro a 10 para que nos haga el random de 0 a 9
		//si el indice es 0 o inferior dara error
		if(indice > 0) {
		int valores[] = new int[indice];
		
		rellenarArray(valores,random);
		
		mostrarArray(valores);
		}else {
			JOptionPane.showMessageDialog(null, "El numerode valores ha de ser mayor que 0");
		}
	}
	
	private static void rellenarArray(int[] valores, int random) {
		//hago un bucle para rellenar el array con numeros randoms
		for (int i = 0; i < valores.length; i++) {
			Random r = new Random();
			
			valores[i] = r.nextInt(random);
		}
	}
	
	private static void mostrarArray(int[] valores) {
		//hago un bucle para imprimir el array
		for (int i = 0; i < valores.length; i++) {
			JOptionPane.showMessageDialog(null, "Indice->"+(i+1)+"  Valor->"+valores[i]);
		}
		
	}
}
