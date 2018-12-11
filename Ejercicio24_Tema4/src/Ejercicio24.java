/*
* DAM
*
* Version: 0
*
* 9/11/2018
*
* Copyright: Sergi Santamaria Sendra
*/
package Ejercicios;

public class Ejercicio24 {

	public static void main(String[] args) {
		
		/*
		 * declaramos las variables
		 */
		String[] cadena = {"wz","ap","wx", "ac"}; 
		int cont = 0;
		int cont2 = 0;
		String aux = "a";
		
		/*
		 * En este bucle for iremos augmentando el contador "cont" que nos servira
		 *  para cojer las posiciones de los valores a comparar
		 */
		for (cont = 1; cont < cadena.length; cont++) { 
			/*
			 *En este bucle for iremos augmentando el contador "cont2" que nos
			 * servira para cojer las posiciones de comparacion
			 */
			for (cont2 = cont; cont2 > 0; cont2--) {				
				
				/*
				 *  En este if comprovamos si la comparacion es negativa,en caso 
				 *  de serlo cambiaremos los valores de posicion
				 */
				if (cadena[cont2].compareTo(cadena[cont2-1]) < 0) {
					
					/*
					 * Utilizamos la variable aux para almacenar el valor de la cadena "pos x+1"
					 */
					aux = cadena[cont2]; 	
					/*
					 *  Cambiamos el valor de la cadena para cambiar el orden "pos x+1" por "pos x"
					 */
					cadena[cont2] = cadena[cont2-1];
					/*
					 * Volvemos a cambiar el valor de la cadena para dejarlo ya ordenado "pos x" = al valor de "aux"
					 */
					cadena[cont2-1] = aux; 							
				}

			}

		}
		/*
		 * En este bucle for utilizamos el contador para imprimir todas
		 * las posiciones del array
		 */
		for (cont = 0; cont < cadena.length; cont++) { 				
			System.out.print(cadena[cont] + " ");
		}
		
	}

}
