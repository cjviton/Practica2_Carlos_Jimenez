package Practica2;

import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {

		int opcion = 0;
		int opcionCanciones = 0;
		int opcionAlbunes = 0;

		try {
			Util.mensaje("*******************************************************************************************************");
			Util.mensaje("******************************_____HOLA, BIENVENIDO A TU SPOTIFY____***********************************");
			Util.mensaje("*******************************************************************************************************");

			while (opcion != 3) { // El switch se debe repetir hasta que elija la opción 3 Salir.Devolverá mensaje
									// de error si no elige entre 1 y 3

				opcion = Util.menu3opciones("¿Quiéres gestionar tus canciones?", "¿Quiéres gestionar tus albunes?",
						"¿Quiéres Salir?");

				switch (opcion) {// Este switch nos introduce en el menú canciones o albunes
				case 1:// canciones

					while (opcionCanciones != 5) { // El switch se debe repetir hasta que elija la opción 5 Salir.
													// Devolverá mensaje de error si no elige entre 1 y 5
											
						Util.mensaje("¿Qué quieres hacer con tus canciones?");

						opcionCanciones = Util.menu5opciones("¿Quiéres añadir una canción?",
								"¿Quieres modificar una canción?", "¿Quiéres eliminar una canción?",
								"¿Quieres busccar una canción?", "¿Quiéres salir?");

						switch (opcionCanciones) {// Este switch nos intruduce dentro del menú de canciones

						case 1:// Añadir canción
							
							System.out.println("cancion 1");

							break;

						case 2:// Modificar canción
							
							System.out.println("cancion 2");

							break;

						case 3:// Eliminar canción
							
							System.out.println("cancion 3");

							break;

						case 4:// Buscar canción
							
							System.out.println("cancion 4");

							break;
						}
					}

					break;

				case 2:// Albunes
					while (opcionAlbunes != 5) { // El switch se debe repetir hasta que elija la opción 5 Salir.
						// Devolverá mensaje de error si no elige entre 1 y 5
					
                     
					Util.mensaje("¿Qué quieres hacer con tus albunes de música?");
					
					opcionAlbunes = Util.menu5opciones("¿Quiéres añadir una album?",
							"¿Quieres modificar una album?", "¿Quiéres eliminar una album?",
							"¿Quieres busccar una album?", "¿Quiéres salir?");

					switch (opcionAlbunes) {

					case 1:// Añadir album
						
						System.out.println("album 1");

						break;

					case 2:// Modificar album
						
						System.out.println("album 2");

						break;

					case 3:// Eliminar album
						
						System.out.println("album 3");

						break;

					case 4:// Buscar album
						
						System.out.println("album 4");

						break;

					}
				  }
					break;
				}
			}

		} catch (Exception e) {

		}

	}
}
