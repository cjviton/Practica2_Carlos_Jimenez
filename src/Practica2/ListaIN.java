package Practica2;

import java.util.ArrayList;

public class ListaIN {
	
	private String ususario;
	private ArrayList<Cancion> milistaIn = new ArrayList<Cancion>();
	
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
		return milistaIn;
	}

	public void setMilistaIn(ArrayList<Cancion> milistaIn) {
		this.milistaIn = milistaIn;
	}

	@Override
	public String toString() {
		return "ListaIN [ususario=" + ususario + ", milistaIn=" + milistaIn + "]";
	}
	
	
	 public void addcancionIn() {   //Añadir cancines en mi lista de español mediante scanner
			
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
				
			milistaIn.add(new Cancion(titulo, artista, genero, ano, EstadoAnimo));
		    }             

}
