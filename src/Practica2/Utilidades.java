package Practica2;

import java.util.Scanner;


public class Utilidades {
	
	/**
	 * Muestra un mensaje por consola
	 * @param mensaje a mostrar
	 * @author Carlos Jiménez
	 * @version 1.0
	 */
	
	public static void mensaje (String mensaje) {
		System.out.println(mensaje);
	}
	
	
	
	/**
	 * Muestra un menú con 3 opciones en consola. 
	 * Devolverá mensaje de error si no elige entre 1 y 3
	 * @param opcion1 Texto con nuestra opcón 1
	 * @param opcion2 Texto con nuestra opcón 2
	 * @param opcion3 Texto con nuestra opcón 3
	 * @return devuelve un número entero entre 1 y 3
	 * @author Carlos Jiménez
	 * @version 1.0
	 */
	
	public static int menu3opciones (String opcion1, String opcion2, String opcion3) {
		
		System.out.println("1.-" + opcion1);
		System.out.println("2.-" + opcion2);
		System.out.println("3.-" + opcion3);
		
		int numero;
		boolean valido = true;

		Scanner lector = new Scanner(System.in);

		do {
			numero = lector.nextInt();
			lector.nextLine();
			if (numero < 1 || numero > 3) {
				System.out.println("El número introducido no es correcto");
				valido = false;
			} else {
				valido = true;
			}
		} while (!valido);
		return numero;
		
	}
	
	
	/**
	 * Muestra un menú con 5 opciones en consola. 
	 * Devolverá mensaje de error si no elige entre 1 y 5
	 * @param opcion1 Texto con nuestra opcón 1
	 * @param opcion2 Texto con nuestra opcón 2
	 * @param opcion3 Texto con nuestra opcón 3
	 * @param opcion4 Texto con nuestra opcón 4
	 * @param opcion5 Texto con nuestra opcón 5
	 * @return devuelve un número entero entre 1 y 5
	 * @author Carlos Jiménez
	 * @version 1.0
	 */

    public static int menu5opciones (String opcion1, String opcion2, String opcion3, String opcion4, String opcion5) {
		
		System.out.println("1.-" + opcion1);
		System.out.println("2.-" + opcion2);
		System.out.println("3.-" + opcion3);
		System.out.println("3.-" + opcion4);
		System.out.println("3.-" + opcion5);
		
		int numero;
		boolean valido = true;

		Scanner lector = new Scanner(System.in);

		do {
			numero = lector.nextInt();
			lector.nextLine();
			if (numero < 1 || numero > 5) {
				System.out.println("El número introducido no es correcto");
				valido = false;
			} else {
				valido = true;
			}
		} while (!valido);
		return numero;
		
	}
	
	
	
	
   
	
	

}
