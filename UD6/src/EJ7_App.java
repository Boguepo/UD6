import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ7_App {
	
	
	
	public static void main(String args[]) {
	
	
		String value = JOptionPane.showInputDialog("Introduce la catidad de euros:");
		double euros = Double.parseDouble(value);
		
		String cambio = JOptionPane.showInputDialog("A que moneda quieres cambiar?\nYen->Y\nDolares -> D\nLibras->L");
		//si la cantidad es 0 o inferior saldra mensaje de error
		if(euros > 0) {
			cambioMoneda(euros,cambio);
		}else {
			JOptionPane.showMessageDialog(null, "Valor negativo");
		}

		
	}

	private static void cambioMoneda(double euros, String cambio) {
		//declaro los factores de conversion
		final double LIBRAS = 0.86;
		final double DOLARS = 1.28611;
		final double YENES = 129.852;
		//Analizo que moneda han introducido y realizo los petinentes calculos
		switch(cambio) {
		case "Y":
			JOptionPane.showMessageDialog(null, euros+" €  ->  "+(euros*YENES)+" yenes");
			break;
		case "D":
			JOptionPane.showMessageDialog(null, euros+" €  ->  "+(euros*DOLARS)+" $");
			break;
		case "L":
			JOptionPane.showMessageDialog(null, euros+" €  ->  "+(euros*LIBRAS)+" yenes");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Moneda erronea");
			break;
		}
		
	}

	
	
}
