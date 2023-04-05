package Practica2;

import java.util.ArrayList;

public class ListaIN {

	private String ususario;
	private ArrayList<Cancion> miListaIn = new ArrayList<Cancion>();

	public ListaIN(String ususario) {
		super();
		this.ususario = ususario;
	}

	public String getUsusario() {
		return ususario;
	}

	public void setUsusario(String ususario) {
		this.ususario = ususario;
	}

	public ArrayList<Cancion> getMilistaIn() {
		return miListaIn;
	}

	public void setMilistaIn(ArrayList<Cancion> milistaIn) {
		this.miListaIn = milistaIn;
	}

	@Override
	public String toString() {
		return "ListaIN [ususario=" + ususario + ", miListaIn=" + miListaIn + "]";
	}

	/**
	 * Añade canciones en mi lista de ingles mediante scanner
	 * 
	 * @author Carlos Jiménez
	 * @version 1.0
	 */
	public void addcancionIn() { // Añadir cancines en mi lista de español mediante scanner

		String titulo = "";
		String artista = "";
		String genero = "";
		int ano = 0;
		String EstadoAnimo = "";

		titulo = Util.pedirString("Titulo");
		artista = Util.pedirString("Artista");
		genero = Util.pedirString("Genero");
		ano = Util.pedirInt("Año");
		EstadoAnimo = Util.pedirString("Estado de ánimo");

		miListaIn.add(new Cancion(titulo, artista, genero, ano, EstadoAnimo));
	}

	/**
	 * Verifica si la lista está vacía
	 * 
	 * @author Carlos Jimenez 
	 * @version1.0
	 */
	public boolean vacia() {
		boolean vacio = true;
		if (miListaIn.isEmpty()) {

		} else {
			vacio = false;
		}
		return vacio;
	}

	/**
	 * Modifica el parametro de tipo String de un objeto tipo Cancion. Este método
	 * se complementa co el método menu5opciones o con el método menu3opciones, que
	 * devuelve un dato de tipo integer, que será el que añadiremos en el parametro.
	 * No he sabido com hecer un método totalmente reutilizable para modificar
	 * parámetros de todo tipo de objetos.
	 * 
	 * @param atributo     Es de tipo Integer. complementar con método
	 *                     menuo_opciones
	 * @param datoAcambiar
	 * @param datoNuevo
	 * @author Carlos jimenez
	 * @version 1.o
	 */
	public void cambiarAtributo(int atributo, String datoAcambiar, String datoNuevo) {

		ArrayList<Cancion> cancion = this.getMilistaIn();
		for (Cancion item : cancion) {

			switch (atributo) {

			case 1:// modifiac título

				if (item.getTitulo().equals(datoAcambiar)) {
					item.setTitulo(datoNuevo);
				}
				break;

			case 2:// modifica artista

				if (item.getArtista().equals(datoAcambiar)) {
					item.setArtista(datoNuevo);
				}
				break;

			case 3:// Modifica Genero

				if (item.getGenero().equals(datoAcambiar)) {
					item.setGenero(datoNuevo);
				}
				break;

			case 5:// Modifica estado de ánimo
				if (item.getEstadoAnimo().equals(datoAcambiar)) {
					item.setEstadoAnimo(datoNuevo);
				}
				break;
			}
		}
	}

	/**
	 * Modifica el parametro año de tipo Integer de un objeto tipo Cancion
	 * 
	 * @param datoAcambiar
	 * @param datoNuevo
	 * @author Carlos Jimenez
	 * @vesion 1.0
	 */
	public void cambiarAtributo(int datoAcambiar, int datoNuevo) {

		ArrayList<Cancion> cancion = this.getMilistaIn();
		for (Cancion item : cancion) {
			if (item.getAno() == datoAcambiar) {
				item.setAno(datoNuevo);
			}
		}
	}

	/**
	 * Elimina un objeto de la clase canción
	 * 
	 * @param datoAeliminar titulo de la canción
	 * @author Carlos Jimenes
	 * @version 1.0
	 */
	public void eliminar(String datoAeliminar) {
		ArrayList<Cancion> cancion = this.getMilistaIn();
		for (Cancion item : cancion) {
			if (item.getTitulo().equals(datoAeliminar)) {
				cancion.remove(item);
			}
		}
	}

}
