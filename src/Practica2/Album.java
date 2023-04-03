package Practica2;

import java.util.ArrayList;

public class Album {
	
	private String tituloAlb;
	private String grupo;
	private ArrayList<Cancion> primerAlbum = new ArrayList<Cancion>();
	
	
	public Album(String tituloAlb, String grupo) {
		super();
		this.tituloAlb = tituloAlb;
		this.grupo = grupo;
	}


	public String getTituloAlb() {
		return tituloAlb;
	}


	public void setTituloAlb(String tituloAlb) {
		this.tituloAlb = tituloAlb;
	}


	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	public ArrayList<Cancion> getPrimerAlbum() {
		return primerAlbum;
	}


	public void setPrimerAlbum(ArrayList<Cancion> primerAlbum) {
		this.primerAlbum = primerAlbum;
	}


	@Override
	public String toString() {
		return "Album [tituloAlb=" + tituloAlb + ", grupo=" + grupo + ", primerAlbum=" + primerAlbum + "]";
	}
	
	
	

}
