package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	
	

public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
	
	super(nombre, edad, habitat, genero);
	this.colorPlumas = colorPlumas;
	listado.add(this);
	
	
}

public Ave () {
	
	listado.add(this);
	
}

public ArrayList<Ave> getListado (){
	
	return listado;
	
}

public static int getCantidadAve(){
	
	return listado.size();
	
}


public String getColorPlumas() {
	
	return colorPlumas;
	
}

public void setListado (ArrayList<Ave> listado) {
	
	Ave.listado = listado;
	
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



	
	

}
