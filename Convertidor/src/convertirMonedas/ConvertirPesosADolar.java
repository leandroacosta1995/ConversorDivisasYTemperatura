
package convertirMonedas;

import javax.swing.JOptionPane;

	public class ConvertirPesosADolar{
		
		public void pesosADolar(double valorRecibido) {
			double monedaDolar = valorRecibido / 730;
			monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Pesos Argentinos:" + valorRecibido + "son Dolares : " + monedaDolar);
		}
		
		public void ConvertirDolarAPeso(double valorRecibido) {
			double monedaDolar = valorRecibido * 730;
			monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Dolares: " + valorRecibido + " Pesos Argentinos: $ " + monedaDolar);
		}	
		
		public void pesosAeuro(double valorRecibido) {
			double monedaEuro = valorRecibido / 782;
			monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Pesos Argentinos:" + valorRecibido + " Euro : " + monedaEuro);
		}
		
		public void ConvertirEuroAPeso(double valorRecibido) {
			double monedaEuro = valorRecibido * 782;
			monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
			JOptionPane.showMessageDialog(null, "Euro: " + valorRecibido + " Pesos Argentinos: $ " + monedaEuro);
		}	
		
		
		
		
		
		
		
		
	}


