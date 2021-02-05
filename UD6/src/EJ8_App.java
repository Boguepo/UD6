import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ8_App {
	public static void main(String args[]) {
		//creo el array
		int valores[] = new int[10];
		//lo relleno
		rellenarArray(valores);
		//lo imprimo
		mostrarArray(valores);
	}

	private static void mostrarArray(int[] valores) {
		//hago un bucle para imprimir el array en pantalla
		for (int i = 0; i < valores.length; i++) {
			JOptionPane.showMessageDialog(null, "Indice->"+(i+1)+"  Valor->"+valores[i]);
		}
		
	}

	private static void rellenarArray(int[] valores) {
		//hago un bucle para pedir todos los datos del array
		for (int i = 0; i < valores.length; i++) {
			String value = JOptionPane.showInputDialog("Intrduce valor:\nTe quedan "+(valores.length-i)+" por introducir");
			int valor = Integer.parseInt(value);
			
			valores[i] = valor;
		}
		
	}
	
	
}
