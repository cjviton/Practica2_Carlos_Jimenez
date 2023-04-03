package Practica2;

import java.util.ArrayList;

public class Artista {

	
	private String nombre;
	ArrayList<Album> misAlbunes = new ArrayList<Album>();
	
	
	public Artista(String nombre) {
		super();
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Album> getMisAlbunes() {
		return misAlbunes;
	}


	public void setMisAlbunes(ArrayList<Album> misAlbunes) {
		this.misAlbunes = misAlbunes;
	}


	@Override
	public String toString() {
		return "Artista [nombre=" + nombre + ", misAlbunes=" + misAlbunes + "]";
	}
	
}
