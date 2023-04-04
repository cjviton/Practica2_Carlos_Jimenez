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

}
