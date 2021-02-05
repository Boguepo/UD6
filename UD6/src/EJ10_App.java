
import java.util.Random;

import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ10_App {
	public static void main(String args[]) {
		String value = JOptionPane.showInputDialog("Cuantos valores quieres introducir?");
		int indice = Integer.parseInt(value);
		//si el indice es 0 o inferior saldra error
		if(indice>0) {
			//declaro el array
		int valores[] = new int[indice];
		//la relleno
		rellenarArray(valores);
		//la ordeno y devuelvo el numero mas grande
		int mayor = ordenarArray(valores);
		
		JOptionPane.showMessageDialog(null, "El numero mas grande es: "+mayor);
		
		
		}else {
			JOptionPane.showMessageDialog(null, "El numero de valores ha de ser positivo");
		}
		
		
		
	}
	
private static int ordenarArray(int[] valores) {
	//variable para poder registrar el numero mas grande
		int aux = 0;
		//hago un bucle para recorrer todas las posiciones
		for (int i = 0; i < valores.length; i++) {
			//si el valor es mayo que el auxiliar se le asigna ese valor
			if(aux<valores[i]) {
				aux = valores[i];
			}
		}
		
		return aux;
		
	}

private static void rellenarArray(int[] valores) {
	//declaramos variable auxiliar para compravar si el numero es primo
		int aux = 0;
		int i  = 0;
		boolean primo;
		
		String limit1 = JOptionPane.showInputDialog("Primer limite del random:\n(Puede ser 0) ");
		int limite1 = Integer.parseInt(limit1);
		
		String limit2 = JOptionPane.showInputDialog("Segundo limite:");
		int limite2 = Integer.parseInt(limit2);
		
		while (i < valores.length) {
			Random r = new Random();
			//valido si el primer limiete es 0 o no
			if(limite1 == 0) {
				aux = r.nextInt(limite2);
			}else {
				aux = r.nextInt(limite2)+limite1;
			}
			
			//compruebo si el numero es primo
			primo = esPrimo(aux);
			//si es primo asigna el valor al array
			if(primo) {
				valores[i] = aux;
				i++;
			}
			
		}
	}

private static boolean esPrimo(int aux) {
	int contador = 2; //lo incio en 2 porque todos los primos son divisibles entre 1
	boolean primo = true;
	
	while(primo && (contador!=aux)) {//mientras sigasiendo primo y el contador  no sea igual al numero
		if(aux%contador==0) {
			primo = false;
		}
		contador++;
	}
	
	return primo;
}
}
