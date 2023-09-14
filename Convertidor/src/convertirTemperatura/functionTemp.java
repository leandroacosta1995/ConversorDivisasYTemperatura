package convertirTemperatura;

import javax.swing.JOptionPane;

public class functionTemp {
	
	convertirTemp Temperatura = new convertirTemp();
	
	public void convertirTemperatura(double tempRecibida) {
		
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione la Temperatura a Convertir","Temperatura",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
				"Fahrenheit A Celsius","Celsius a Fahrenheit"}, "Seleccion")).toString();
		
		switch(opciones) {
		case "Fahrenheit A Celsius":
			Temperatura.FahrenheitACelsius(tempRecibida);
			break;
		case "Celsius a Fahrenheit":
			Temperatura.CelsiusAFahrenhet(tempRecibida);
			break;
		default:
			break;
		}
	}
}
