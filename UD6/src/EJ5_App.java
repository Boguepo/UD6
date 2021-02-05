import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ5_App {
	public static void main(String args[]) {
		String value = JOptionPane.showInputDialog("Introduce el numero");
		int num = Integer.parseInt(value);
		
		convertirBinario(num);
	}

	private static void convertirBinario(int num) {
		int numero = num;
		String binario ="";
		int digito;
		String aux = "";//declaro un auxiliar para poder invertir el binario
		
		while(num!=0) {
			digito = num % 2;//calculo el residuo
			binario += digito;//sumo el valor a binario 
			num =  num/2;//divido entre 2 para conseguir el proximo numero
		}
		//hago un bucle para dar la vuelta al binario
		for (int j = binario.length()-1; j >= 0; j--) {
			aux = aux + binario.charAt(j);
			
		}
		
		JOptionPane.showMessageDialog(null, "El numero "+numero+" en binario es "+aux);
	}
}
