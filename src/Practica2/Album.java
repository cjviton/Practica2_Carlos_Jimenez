package Practica2;

import java.util.ArrayList;

public class Album {
	
	private String tituloAlb;
	private ArrayList<Cancion> primerAlbum = new ArrayList<Cancion>();
	
	
	public Album(String tituloAlb) {
		super();
		this.tituloAlb = tituloAlb;
	}


	public String getTituloAlb() {
		return tituloAlb;
	}


	public void setTituloAlb(String tituloAlb) {
		this.tituloAlb = tituloAlb;
	}


	public ArrayList<Cancion> getPrimerAlbum() {
		return primerAlbum;
	}


	public void setPrimerAlbum(ArrayList<Cancion> primerAlbum) {
		this.primerAlbum = primerAlbum;
	}


	@Override
	public String toString() {
		return "Album [tituloAlb=" + tituloAlb + ", primerAlbum=" + primerAlbum + "]";
	}
		

}
