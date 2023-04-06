package Practica2;

import java.util.ArrayList;

public class ListaES {

	private String usuario;
	private ArrayList<Cancion> miListaEs = new ArrayList<Cancion>();

	public ListaES(String usuario) {
		super();
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public ArrayList<Cancion> getMiListaEs() {
		return miListaEs;
	}

	public void setMiListaEs(ArrayList<Cancion> miListaEs) {
		this.miListaEs = miListaEs;
	}

	@Override
	public String toString() {
		return "ListaES [usuario=" + usuario + ", miListaEs=" + miListaEs + "]";
	}

	/**
	 * Añade canciones en mi lista de español mediante scanner
	 * 
	 * @author Carlos Jimenez
	 * @version 1.0
	 */
	public void addcancionEs() { // Añadir canciones en mi lista de español mediante scanner

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

		miListaEs.add(new Cancion(titulo, artista, genero, ano, EstadoAnimo));
	}

	/**
	 * Verifica si la lista está vacía
	 * 
	 * @author Carlos Jimenez @version1.0
	 */
	public boolean vacia() {
		boolean vacio = true;
		if (miListaEs.isEmpty()) {

		} else {
			vacio = false;
		}
		return vacio;
	}


	/**
	 * Modifica el parametro de tipo String de un objeto tipo Cancion. Este método
	 * se complementa co el meétodo menu5opciones o con el método menu3opciones, que
	 * devuelve un dato de tipo integer, que será el que añadiremos en el parametro.
	 * No he sabido como hecer un método totalmente reutilizable para modificar
	 * parámetros de todo tipo de objetos.
	 * 
	 * @param atributo     Es de tipo Integer. complementar con método
	 *                     menuo_opciones
	 * @param datoAcambiar
	 * @param datoNuevo
	 * @author Carlos Jimenez
	 * @version 1.0
	 */
	public void cambiarAtributo(int atributo, String datoAcambiar, String datoNuevo) {

		ArrayList<Cancion> cancion = this.getMiListaEs();
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
	 * Modifica el parametro de tipo Integer de un objeto tipo Cancion
	 * 
	 * @param datoAcambiar
	 * @param datoNuevo
	 * @author Carlos Jimenez
	 * @version 1.0
	 */

	public void cambiarAtributo(int datoAcambiar, int datoNuevo) {

		ArrayList<Cancion> cancion = this.getMiListaEs();
		for (Cancion item : cancion) {
			if (item.getAno() == datoAcambiar) {
				item.setAno(datoNuevo);
			}
		}
	}
	
	
	/*public void eliminar (String datoAeliminar) {
		int longitud = miListaEs.size();
		boolean encontrado=false;
		
		for( int i=0; i<longitud; i++) {
			
			if(miListaEs.get(i).getTitulo().equals(datoAeliminar)) {
				
				miListaEs.remove(i);
				i++;
				encontrado = true;				
			}				
		}	
	}
	*/
	// ------------------------------Estod métodos no me funcionan para eliminar--------------------------------------------

	/**
	 * Elimina un objeto de la clase canción
	 * 
	 * @param datoAeliminar titulo de la canción
	 * @author Carlos jimenez @1.0
	 */
	public void eliminar(String datoAeliminar) {
		int longitud = miListaEs.size();
		int i=0;
		boolean encontrado = false;
				
		if (longitud > 0 ) {
			do {
				if (miListaEs.get(i).getTitulo().equals(datoAeliminar)) {
					miListaEs.remove(i);
					encontrado=true;
				}
				i++;
			}while (i < longitud && !encontrado);
		
		}
	}
	

	
	/**
	 * Elimina un objeto de la clase canción
	 * 
	 * @param datoAeliminar titulo de la canción
	 * @author Carlos jimenez @1.0
	 */
	/*public void eliminar(String datoAeliminar) {
	
			for (Cancion item : miListaEs) {
			if (item.getTitulo().equals(datoAeliminar)) {
				miListaEs.remove(item);
				
			}
		}
	}
	*/
	
	/*public static int buscarPosicion(String lista, String nombre) {

		int longitud = lista.size();
		int i = 0;
		int posicion = -1;
		boolean encontrado = false;

		if (longitud > 0) {
			do {
				if (lista[i].equals(nombre)) {
					posicion = i;
					encontrado = true;
				}
				i++;
			} while (i < longitud && !encontrado);
		}

		return posicion;
	}
       */ 
	
	/**
	 * Cambia el contenido del parametro titulo del un objeto cancion
	 * 
	 * @param tituloAcambiar
	 * @param tituloNuevo
	 */
	public void cambiartitulo(String tituloAcambiar, String tituloNuevo) {

		for (Cancion item : miListaEs) {
			if (item.getTitulo().equals(tituloAcambiar)) {
				item.setTitulo(tituloNuevo);
			}
		}
	}

	/**
	 * Busca la posición en la lista del titulo introducido por parametro
	 * 
	 * @param tituloBuscado
	 * @return indice
	 */
	public int buscarCancionPorTitulo(String tituloBuscado) {
				int posicionBuscada = -1;
		for (int i = 0; i < miListaEs.size(); i++) {
			if (miListaEs.get(i).getTitulo().equals(tituloBuscado)) {
				posicionBuscada = i;				
			}
		}
		return posicionBuscada;
	}

}
