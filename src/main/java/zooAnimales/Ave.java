package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	
	

public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
	
	super(nombre, edad, habitat, genero);
	this.colorPlumas = colorPlumas;
	Ave.listado.add(this);
	
	
}

public Ave () {
	
	this(null, 0, null, null, null);
	
}

public static ArrayList<Ave> getListado (){
	
	return Ave.listado;
	
}

public int CantidadAves(){
	
	return Ave.listado.size();
	
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
