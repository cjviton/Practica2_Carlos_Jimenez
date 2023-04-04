package Practica2;

public class Cancion {
	
	private String titulo;
	private String artista;
	private String genero;
	private int ano;
	private String EstadoAnimo;
	
	public Cancion(String titulo, String artista, String genero, int ano, String estadoAnimo) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.genero = genero;
		this.ano = ano;
		EstadoAnimo = estadoAnimo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getEstadoAnimo() {
		return EstadoAnimo;
	}

	public void setEstadoAnimo(String estadoAnimo) {
		EstadoAnimo = estadoAnimo;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + ", genero=" + genero + ", ano=" + ano
				+ ", EstadoAnimo=" + EstadoAnimo + "]";
	}
	

}
