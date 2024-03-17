package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
	
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	
	

public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
	
	super(nombre, edad, habitat, genero);
	this.pelaje = pelaje;
	this.patas = patas;
	Mamifero.listado.add(this);
	
		
}

public Mamifero () {
	
	Mamifero.listado.add(this);
	
}

public static ArrayList<Mamifero> getListado(){
	
	return Mamifero.listado;
	
}

public static int getCantidadMamifero(){
	
	return Mamifero.listado.size();
	
}

public boolean isPelaje () {
	
	return pelaje;
	
}

public int getPatas () {
	
	return patas;
	
}

public void setListado (ArrayList<Mamifero> listado) {
	
	Mamifero.listado = listado;
	
}


public void setPelaje (boolean pelaje) {
	
	this.pelaje = pelaje;
	
}

public void setPatas (int patas) {
	
	this.patas = patas;
}

public static Mamifero crearCaballo(String nombre, int edad, String genero) {
	
	 Mamifero nuevoCaballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
	caballos++;
	return nuevoCaballo;
		
}

public static Mamifero crearLeon(String nombre, int edad, String genero) {
	
	Mamifero nuevoLeon = new Mamifero(nombre, edad, "selva", genero, true, 4);
	leones++;
	return nuevoLeon;
}


	
	
}
