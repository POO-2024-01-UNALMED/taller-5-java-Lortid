package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	
	private ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	private static int cantidadAve;
	
	

public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
	
	super(nombre, edad, habitat, genero);
	this.colorPlumas = colorPlumas;
	this.listado.add(this);
	cantidadAve++;
	
}

public Ave () {
	
	this.listado.add(this);
	
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
@Override
public String movimiento() {
	
	return "volar";
}

public static Ave crearHalcon(String nombre, int edad, String genero) {
	
	Ave nuevoHalcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	halcones++;
	return nuevoHalcon;
	
}

public static Ave crearAguila(String nombre, int edad, String genero) {
	
	Ave nuevaAguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	aguilas++;
	return nuevaAguila;
	
}

public static int getCantidadAve() {
	
	return cantidadAve;
}

	
	

}
