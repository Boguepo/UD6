
import java.util.Random;

import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ12_App {
	public static void main(String args[]) {
		String value =JOptionPane.showInputDialog("Cuantos numeros quieres?");
		int indice = Integer.parseInt(value);
		
		Random r = new Random();
		//declaro las arrays
		int valores[] = new int[indice];
		int valores2[] =new int[indice];
		//relleno una con numeros random
		rellenarArray(valores, r);
		//compruebo las terminaciones
		comprobarNumero(valores,valores2);
		//imprimoel array resultante
		imprimirArray(valores2);
	}
	
private static void imprimirArray(int[] valores2) {
		//bucle para imprimir el array
	for (int i = 0; i < valores2.length; i++) {
		if(valores2[i] != 0) {
			JOptionPane.showMessageDialog(null, "Valor: "+valores2[i]);
		}
		
	}
		
	}

private static void comprobarNumero(int[] valores, int[] valores2) {
		String valor = JOptionPane.showInputDialog("Terminacion:");
		int val = Integer.parseInt(valor);
		//compruebo que el valor 0 o es positivo
		if(val>=0) {
			//como estamos introduciendo una terminacion solo tenemos un numero
		char term = valor.charAt(0);
		
		for (int i = 0; i < valores.length; i++) {
			//transformo el numero a string para ver si son iguales
			String aux  = Integer.toString(valores[i]);
			//cogo el ultimo carater
			char last = aux.charAt(aux.length()-1);
			//valido si es igual que la terminacion
			if(term == last) {
				valores2[i] = valores[i];
			}
		}
		}else {
			JOptionPane.showMessageDialog(null, "");
		}
		
	}

private static void rellenarArray(int[] valores, Random r) {
		//relleno array con numeros random
		for (int i = 0; i < valores.length; i++) {
			
			valores[i] = r.nextInt(300)+1;
		}
	}
}
