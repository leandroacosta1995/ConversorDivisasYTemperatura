package convertirMonedas;

import javax.swing.JOptionPane;

public class function{
	
	ConvertirPesosADolar monedas = new ConvertirPesosADolar();
	
	public void ConvertirMoneda(double valorRecibido) {
		
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione la Moneda a Convertir","Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
				"Pesos Argentinos a Dolares","Dolares a Pesos Argentinos", "Pesos Argentinos a Euros","Euros a Pesos Argentinos"}, "Seleccion")).toString();
		
		switch (opciones) {
		case "Pesos Argentinos a Dolares":
			monedas.pesosADolar(valorRecibido);
			break;
		
		case "Dolares a Pesos Argentinos":
			monedas.ConvertirDolarAPeso(valorRecibido);
			break;
			
		case "Euros a Pesos Argentinos":
			monedas.pesosAeuro(valorRecibido);
			break;
		case "Pesos Argentinos a Euros":
			monedas.ConvertirEuroAPeso(valorRecibido);
			break;
			
			default:
			break;
		}
	
	}

}
