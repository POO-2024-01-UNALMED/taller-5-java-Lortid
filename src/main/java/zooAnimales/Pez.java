package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {

	private ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	private static int cantidadPez;
	
	
public Pez (String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {

	super( nombre, edad, habitat, genero);
	this.colorEscamas = colorEscamas;
	this.cantidadAletas = cantidadAletas;
	this.listado.add(this);
	cantidadPez++;
	
}

public Pez () {
	
	this.listado.add(this);
		
}

public ArrayList<Pez> getListado (){
	
	return listado;
	
}

public String getColorEscamas () {
	
	return colorEscamas;
	
}

public int getCantidadAletas () {
	
	return cantidadAletas;
	
}

public void setListado (ArrayList<Pez> listado) {
	
	this.listado = listado;
	
}

public void setColorEscamas (String colorEscamas) {
	
	this.colorEscamas = colorEscamas;
	
}

public void setCantidadAletas (int cantidadAletas) {
	
	this.cantidadAletas = cantidadAletas;
}

@Override
public String movimiento() {
	
	return "nadar";
}

public static Pez crearSalmon(String nombre, int edad, String genero) {
	
	Pez nuevoSalmon = new Pez (nombre, edad, "oceano", genero, "rojo", 6);
	salmones++;
	return nuevoSalmon;
}

public static Pez crearBacalao(String nombre, int edad, String genero) {
	
	Pez nuevoBacalao = new Pez (nombre, edad, "oceano", genero, "gris", 6);
	bacalaos++;
	return nuevoBacalao;
}

public static int getCantidadPez() {
	
	return cantidadPez;
}


}
