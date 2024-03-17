package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	
	private ArrayList<Ave> listado = new ArrayList<Ave>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	

public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
	
	super(nombre, edad, habitat, genero);
	this.colorPlumas = colorPlumas;
	this.listado.add(this);
	
}

public Ave () {
	
}

public ArrayList<Ave> getListado (){
	
	return listado;
	
}


public String getColorPlumas() {
	
	return colorPlumas;
	
}

public void setListado (ArrayList<Ave> listado) {
	
	this.listado = listado;
	
}

public void setColorPlumas (String colorPlumas) {
	
	this.colorPlumas = colorPlumas;
}

public String movimiento() {
	
	return "volar";
}

public Ave crearHalcon(String nombre, int edad, String genero) {
	
	Ave nuevoHalcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	halcones++;
	return nuevoHalcon;
	
}

public Ave crearAguila(String nombre, int edad, String genero) {
	
	Ave nuevaAguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	aguilas++;
	return nuevaAguila;
	
}
	
	

}
