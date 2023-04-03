package Practica2;

public class Cancion {
	
	private String titulo;
	private int año;
	private String genero;
	
	
	public Cancion(String titulo, int año, String genero) {
		super();
		this.titulo = titulo;
		this.año = año;
		this.genero = genero;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", año=" + año + ", genero=" + genero + "]";
	}
	
	

}
