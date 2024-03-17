package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {

	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	

public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
	
	super(nombre, edad, habitat, genero);
	this.colorPiel = colorPiel;
	this.venenoso = venenoso;
	Anfibio.listado.add(this);
	
}


public Anfibio () {
	
	Anfibio.listado.add(this);
	
}


public static ArrayList<Anfibio> getListado(){
	
	return Anfibio.listado;
}

public static int getCantidadAnfibio(){
	
	return Anfibio.listado.size();
}


public String getColorPiel () {
	
	return colorPiel;
	
}

public boolean isVenenoso () {
	
	return venenoso;
	
}

public static void setListado (ArrayList<Anfibio> listado) {
	
	Anfibio.listado = listado;
	
}

public void setColorPiel (String colorPiel) {
	
	this.colorPiel = colorPiel;
	
}

public void setVenenoso (boolean venenoso) {
	
	this.venenoso = venenoso;
}

@Override
public String movimiento() {
	
	return "saltar";
}

public static Anfibio crearRana(String nombre, int edad, String genero) {
	
	Anfibio nuevaRana = new Anfibio (nombre, edad, "selva", genero, "rojo", true );
	ranas++;
	return nuevaRana;
	
	
}

public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
	
	Anfibio nuevaSalamandra = new Anfibio (nombre, edad, "selva", genero, "negro y amarillo", false );
	salamandras++;
	return nuevaSalamandra;
	
	
}


	
	

}
