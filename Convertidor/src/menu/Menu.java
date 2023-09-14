package menu;

import javax.swing.JOptionPane;

import convertirMonedas.function;
import convertirTemperatura.functionTemp;

public class Menu{

	public static void ejecutarAplicacion() {

		function monedas = new function();
		functionTemp temperatura = new functionTemp(); 
		
		try {
			String opciones;
			int menuSi = JOptionPane.YES_OPTION;
			
		do {
			opciones = (JOptionPane.showInputDialog(null, "Seleccione que Desea Convertir","Menu",
					JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Monedas","Temperatura"},"Seleccion")).toString();
			
			switch (opciones) {
				case "Monedas":{
	           String input = JOptionPane.showInputDialog("Ingrese la Cantidad que desea Convertir");
			
	            while (!esNumero(input)) {
	               JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
	               input = JOptionPane.showInputDialog(null, "Por favor ingrese el monto");
	           }
	           
	            double valorRecibido = Double.parseDouble(input);
	            	monedas.ConvertirMoneda(valorRecibido);
	            
	            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
	            	System.out.println(seleccion);
	           
			}
			break;
			
				case "Temperatura":{
					String input = JOptionPane.showInputDialog("Ingrese la T° que desea Convertir");
					
		            while (!esNumero(input)) {
		               JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
		               input = JOptionPane.showInputDialog(null, "Por favor ingrese el monto");
		           }
		           
		            double temperaturaRecibida = Double.parseDouble(input);
		            	temperatura.convertirTemperatura(temperaturaRecibida);
		            
		            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
		            	System.out.println(seleccion);
				}
			
			default:
				break;
		}
		} while (JOptionPane.YES_OPTION == menuSi);
	}	catch (Exception e) {
	      JOptionPane.showMessageDialog(null, "¡Vuelva pronto!");
	    }
}
	 	private static boolean esNumero(String num) {
	 			try {
	 			Double.parseDouble(num);
	 			return true;
	 			} catch (NumberFormatException nfe) {
		    	return false;
		    }	
		  }
}
