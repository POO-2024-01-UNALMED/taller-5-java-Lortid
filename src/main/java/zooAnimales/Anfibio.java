package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {

	private ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	

public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
	
	super(nombre, edad, habitat, genero);
	this.colorPiel = colorPiel;
	this.venenoso = venenoso;
	this.listado.add(this);
	
	
}

public Anfibio () {
	
}

public ArrayList<Anfibio> getListado(){
	
	return listado;
}


public String getColorPiel () {
	
	return colorPiel;
	
}

public boolean getVenenoso () {
	
	return venenoso;
	
}

public void setListado (ArrayList<Anfibio> listado) {
	
	this.listado = listado;
	
}

public void setColorPiel (String colorPiel) {
	
	this.colorPiel = colorPiel;
	
}

public void setVenenoso (boolean venenoso) {
	
	this.venenoso = venenoso;
}

public String movimiento() {
	
	return "saltar";
}

public Anfibio crearRana(String nombre, int edad, String genero) {
	
	Anfibio nuevaRana = new Anfibio (nombre, edad, "selva", genero, "rojo", true );
	ranas++;
	return nuevaRana;
	
	
}

public Anfibio crearSalamandra(String nombre, int edad, String genero) {
	
	Anfibio nuevaSalamandra = new Anfibio (nombre, edad, "selva", genero, "negro y amarillo", false );
	salamandras++;
	return nuevaSalamandra;
	
	
}
	
	

}
