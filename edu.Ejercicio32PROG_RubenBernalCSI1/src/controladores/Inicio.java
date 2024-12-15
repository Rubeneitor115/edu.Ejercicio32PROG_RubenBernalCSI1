/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.time.LocalDate;

/**
 * Clase controladora de la aplicacion
 * @author rbr - 151224
 *
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 151224
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creo una fecha que represente el 1 de enero de 2022
		String fechaTexto = "2022-01-01";
		LocalDate fecha = LocalDate.parse(fechaTexto);
		
		//Sumo 100 días a la fecha y muestro el resultado
		LocalDate fechaSumandoDias = fecha.plusDays(100);
		System.out.println("Fecha sumando 100 dias: " + fechaSumandoDias);
		
		//Resto 45 días a la fecha original y muestro el resultado
		LocalDate fechaRestandoDias = fecha.minusDays(45);
		System.out.println("Fecha restando 45 dias: " + fechaRestandoDias);

	}

}
