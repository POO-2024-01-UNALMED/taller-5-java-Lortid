package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {

	private ArrayList<Pez> listado = new ArrayList<Pez>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	
public Pez (String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {

	super( nombre, edad, habitat, genero);
	this.colorEscamas = colorEscamas;
	this.cantidadAletas = cantidadAletas;
	this.listado.add(this);
	
}

public Pez () {
		
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

public String movimiento() {
	
	return "nadar";
}

public Pez crearSalmones(String nombre, int edad, String genero) {
	
	Pez nuevoSalmon = new Pez (nombre, edad, "oceano", genero, "rojo", 6);
	salmones++;
	return nuevoSalmon;
}

public Pez crearBacalao(String nombre, int edad, String genero) {
	
	Pez nuevoBacalao = new Pez (nombre, edad, "oceano", genero, "gris", 6);
	bacalaos++;
	return nuevoBacalao;
}


}
