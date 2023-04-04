package Practica2;

import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {

		int opcion = 0;
		int opcionCancionesES = 0;
		int opcionCancionesIN = 0;
		ListaES miListaEspañol = new ListaES("Carlos"); // Creo mi lista para español
		ListaIN miListaIngles = new ListaIN("Diana"); // Creo mi lista para ingles

		try {
			Util.mensaje(
					"*******************************************************************************************************");
			Util.mensaje(
					"******************************_____HOLA, BIENVENIDO A TU SPOTIFY____***********************************");
			Util.mensaje(
					"*******************************************************************************************************");

			while (opcion != 3) { // El switch se debe repetir hasta que elija la opción 3 Salir.Devolverá mensaje
									// de error si no elige entre 1 y 3

				opcion = Util.menu3opciones("¿Quiéres tu lista de reproducción en español?",
						"¿Quiéres tu lista de reproducción en ingles?", "¿Quiéres Salir?");

				switch (opcion) {// Este switch nos introduce en el menú de listas en español o en ingles
				case 1:// canciones español

					while (opcionCancionesES != 5) { // El switch se debe repetir hasta que elija la opción 5 Salir.
														// Devolverá mensaje de error si no elige entre 1 y 5

						Util.mensaje("¿Qué quiéres hacer en tu lista de reproducción en español?");

						opcionCancionesES = Util.menu5opciones("¿Quiéres añadir una canción?",
								"¿Quieres modificar una canción?", "¿Quiéres eliminar una canción?",
								"¿Quieres busccar una canción?", "¿Quiéres salir?");

						switch (opcionCancionesES) {// Este switch nos intruduce dentro del menú de canciones en español

						case 1:// Añadir canción español
                            Util.mensaje("Aquí puedes añadir tu nueva canción a la lista de reproducción");
							miListaEspañol.addcancionEs();
							System.out.println(miListaEspañol.toString());

							break;

						case 2:// Modificar canción español

							System.out.println("cancion ES2");

							break;

						case 3:// Eliminar canción español

							System.out.println("cancion ES3");

							break;

						case 4:// Buscar canción español

							System.out.println("cancion ES4");

							break;
						}
					}

					break;

				case 2:// canciones ingles
					while (opcionCancionesIN != 5) { // El switch se debe repetir hasta que elija la opción 5 Salir.
						// Devolverá mensaje de error si no elige entre 1 y 5

						Util.mensaje("¿Qué quiéres hacer en tu lista de reproducción en ingles?");

						opcionCancionesIN = Util.menu5opciones("¿Quiéres añadir una canción?",
								"¿Quieres modificar una canción?", "¿Quiéres eliminar una canción?",
								"¿Quieres busccar una canción?", "¿Quiéres salir?");

						switch (opcionCancionesIN) {

						case 1:// Añadir canción ingles
						    Util.mensaje("Aquí puedes añadir tu nueva canción a la lista de reproducción");
							miListaIngles.addcancionIn();
							System.out.println(miListaIngles.toString());

							break;

							
							
						case 2:// Modificar canción ingles

							System.out.println("cancion in2");

							break;

						case 3:// Eliminar canción ingles

							System.out.println("cancion in3");

							break;

						case 4:// Buscar canción ingles

							System.out.println("cancion in4");

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
