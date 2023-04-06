package Practica2;

import java.util.ArrayList;

public class Controlador {

	public static void main(String[] args) {

		int opcion = 0;
		int opcionCancionesES = 0;
		int opcionCancionesIN = 0;

		ListaES miListaEspanol = new ListaES("Carlos"); // Creo mi lista para español
		ListaIN miListaIngles = new ListaIN("Diana"); // Creo mi lista para ingles

		boolean vaciaEs = false;
		boolean vaciaIn = false;

		int parametroAmodidficarEs;
		String datoOutEs;
		String datoInEs;
		int datoOutEsInteger;
		int datoInEsInteger;

		int parametroAmodidficarIn;
		String datoOutIn;
		String datoInIn;
		int datoOutInInteger;
		int datoInInInteger;

		String cancionDelEs;
		String cancionDelIn;

		//try {
			Util.mensaje(
					"*******************************************************************************************************");
			Util.mensaje(
					"******************************_____HOLA, BIENVENIDO A TU SPOTIFY____***********************************");
			Util.mensaje(
					"*******************************************************************************************************");
			opcion = 0;
			while (opcion != 3) { // El switch se debe repetir hasta que elija la opción 3 Salir.Devolverá mensaje
									// de error si no elige entre 1 y 3

				opcion = Util.menu3opciones("¿Quiéres tu lista de reproducción en español?",
						"¿Quiéres tu lista de reproducción en ingles?", "¿Quiéres Salir?");

				switch (opcion) {// Este switch nos introduce en el menú de listas en español o en ingles
				case 1:// canciones español
					opcionCancionesES = 0;
					while (opcionCancionesES != 5) { // El switch se debe repetir hasta que elija la opción 5 Salir.
														// Devolverá mensaje de error si no elige entre 1 y 5

						Util.mensaje("¿Qué quiéres hacer en tu lista de reproducción en español?");

						opcionCancionesES = Util.menu5opciones("¿Quiéres añadir una canción?",
								"¿Quieres modificar una canción?", "¿Quiéres eliminar una canción?",
								"¿Quieres busccar una canción?", "¿Quiéres salir?");

						switch (opcionCancionesES) {// Este switch nos intruduce dentro del menú de canciones en español

						case 1:// Añadir canción español
							Util.mensaje("Aquí puedes añadir tu nueva canción a la lista de reproducción");
							miListaEspanol.addcancionEs();
							System.out.println(miListaEspanol.toString());

							break;

						case 2:// Modificar canción español
							vaciaEs = miListaEspanol.vacia();// Si la lista está vacía, me informa y no
																// y no me deja modidficar.
							if (vaciaEs == true) {
								System.out.println("No se pueden modificar canciones porque tu lista está vacia.");
							} else { // Muestra la lista de canciones para confirmar
										// el dato a modificar
								Util.mensaje("Esta es tu lista de canciones: ");
								System.out.println(miListaEspanol.toString());

								Util.mensaje("¿Qué quiéres modificar?");
								parametroAmodidficarEs = Util.menu5opciones("Titulo", "Artista", "Género", "Año",
										"Estado de ánimo");

								if (parametroAmodidficarEs == 4) {// Hago una condición por si el parámetro a cambiar es
																	// año de tipo Integer

									datoOutEsInteger = Util.pedirInt("¿Cuál quiéres modificar?");

									datoInEsInteger = Util.pedirInt("¿Cuál quiéres introducir en su lugar?");

									miListaEspanol.cambiarAtributo(datoOutEsInteger, datoInEsInteger);

								} else {

									datoOutEs = Util.pedirString("¿Cuál quiéres modificar?");

									datoInEs = Util.pedirString("¿Cuál quiéres introducir en su lugar?");

									miListaEspanol.cambiarAtributo(parametroAmodidficarEs, datoOutEs, datoInEs);

									System.out.println(miListaEspanol.toString());
								}
							}

							break;

						case 3:// Eliminar canción español
							vaciaEs = miListaEspanol.vacia();// Si la lista está vacía, me informa y no
																// y no me deja modidficar.

							if (vaciaEs == true) {
								System.out.println("La lista está vacia");
							} else {
								Util.mensaje("Esta es tu lista de canciones: ");
								System.out.println(miListaEspanol.toString());
								
								cancionDelEs = Util.pedirString("¿Qué canción quieres eliminar?");

								miListaEspanol.eliminar(cancionDelEs);

								System.out.println(miListaEspanol.toString());

							}

							break;

						case 4:// Buscar canción español

							System.out.println("cancion ES4");

							break;
						}
					}

					break;

//-------------------------------------------------------INGLES------------------------------------------------------------------------

			case 2:// canciones ingles
					opcionCancionesIN = 0;
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

					/*	case 2:// Modificar canción ingles

							vaciaIn = miListaIngles.vacia();// Si la lista está vacía, me informa y no
							// y no me deja modidficar.
							if (vaciaIn == true) {
								System.out.println("No se pueden modificar canciones porque tu lista está vacia.");
							} else { // Muestra la lista de canciones para confirmar
								// el dato a modificar
								Util.mensaje("Esta es tu lista de canciones: ");
								System.out.println(miListaIngles.toString());

								Util.mensaje("¿Qué quiéres modificar?");
								parametroAmodidficarIn = Util.menu5opciones("Titulo", "Artista", "Género", "Año",
										"Estado de ánimo");

								if (parametroAmodidficarIn == 4) {// Hago una condición por si el parámetro a cambiar es
																	// año de tipo Integer

									datoOutInInteger = Util.pedirInt("¿Cuál quiéres modificar?");

									datoInInInteger = Util.pedirInt("¿Cuál quiéres introducir en su lugar?");

									miListaIngles.cambiarAtributo(datoOutInInteger, datoInInInteger);

								} else {

									datoOutIn = Util.pedirString("¿Cuál quiéres modificar?");

									datoInIn = Util.pedirString("¿Cuál quiéres introducir en su lugar?");

									miListaIngles.cambiarAtributo(parametroAmodidficarIn, datoOutIn, datoInIn);

									System.out.println(miListaIngles.toString());
								}
							}

							break;

						case 3:// Eliminar canción ingles

							vaciaIn = miListaIngles.vacia();// Si la lista está vacía, me informa y no
							// y no me deja modidficar.

							if (vaciaIn == true) {
								System.out.println("La lista está vacia");
							} else {
								Util.mensaje("Esta es tu lista de canciones: ");
								System.out.println(miListaIngles.toString());
								
								
								cancionDelIn = Util.pedirString("¿Qué canción quieres eliminar?");

								miListaIngles.eliminar(cancionDelIn);

								System.out.println(miListaIngles.toString());

							}
							
							break;
*/
						case 4:// Buscar canción ingles

							System.out.println("cancion in4");

							break;

						}
					}
					break;
				}
		 }

	//	} catch (Exception e) {
	//		System.out.println("Has introducido un dato erroneo. Vuelve a iniciar el programa");
	//	}

	}
}
