import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ2_App {
	public static void main(String args[]) {
		//pido el indice de mi array 
		String value = JOptionPane.showInputDialog("Cuantos numeros quieres:");
		int num = Integer.parseInt(value);
		//llamo a la funcion para generar randoms
		generarRandom(num);
		
		
		
	}

	private static void generarRandom(int num) {
		//pido el primer limite del numero aleatorio
		String value2 = JOptionPane.showInputDialog("Primer limite:");
		int limit1 = Integer.parseInt(value2);
		//si el limite introducido es 0 se convierte en 1 
		if(limit1 == 0) {
			limit1 = 1;
		}
		//pido el segundo limite del random
		String value3 = JOptionPane.showInputDialog("Segundo limite:");
		int limit2 = Integer.parseInt(value3);
		//defino el array con el indice que pase por parametros
		int numeros[] = new int[num];
		
		Random r = new Random();
		//hago un bucle para rellenar el array (esta funcionalidad se podria haber hecho en otro metodo)
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(limit2)+limit1;
		}
		
		JOptionPane.showMessageDialog(null, "Numeros aleatorios:"+Arrays.toString(numeros));
		
	}
}
