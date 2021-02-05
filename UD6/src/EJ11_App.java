
import java.util.Random;

import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ11_App {
	public static void main(String args[]) {
		String val = JOptionPane.showInputDialog("Cuantos numeros quieres?");
		int indice = Integer.parseInt(val);
		
		Random r = new Random();
		//defino y relleno el array
		int arr1[] = new int[indice];
		rellenarArray(arr1,r);
		//defino y relleno el array con los valores del primero y luego con nuemros random
		int arr2[] = new int[indice];
		copyArray(arr1,arr2);
		rellenarArray(arr2, r);
		//defino el array y la relleno de los productos de las otras dos
		int arr3[] = new int[indice];
		productoArray(arr1,arr2,arr3);
		//imprimo las tres
		imprimirArray(arr1);
		imprimirArray(arr2);
		imprimirArray(arr3);
	}
	
private static void imprimirArray(int[] arr1) {
		//bucle para imprimir el array, el ultimo systemes para separar de los demas resultado
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Array: "+arr1[i]);
		}
		System.out.println("---------------------");
	}

private static void productoArray(int[] arr1, int[] arr2, int[] arr3) {
		//bucle para sacar los productos de las arrays
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i]*arr2[i];
		}
		
	}

private static void copyArray(int[] arr1, int[] arr2) {
	//rellena un array con los valores de otra
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
	}

private static void rellenarArray(int[] valores, Random r) {
		//rellena array con nuemros random
		for (int i = 0; i < valores.length; i++) {
			
			valores[i] = r.nextInt(100)+1;
		}
	}
}
