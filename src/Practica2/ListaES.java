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
	
	

    public void addcancionEs() {   //Añadir canciones en mi lista de español mediante scanner
		
    	String titulo="";
    	String artista="";
    	String genero="";
    	int ano=0;
    	String EstadoAnimo="";
		
    	titulo=Util.pedirString("Titulo");
    	artista=Util.pedirString("Artista");
    	genero=Util.pedirString("Genero");
    	ano=Util.pedirInt("Año");
    	EstadoAnimo=Util.pedirString("Estado de ánimo");
		
    	miListaEs.add(new Cancion(titulo, artista, genero, ano, EstadoAnimo));
    	}             
	
	    
	    
	    
	    
}
