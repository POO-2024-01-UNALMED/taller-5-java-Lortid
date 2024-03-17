package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	
	private static ArrayList <Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	
public Reptil (String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
	
	super( nombre, edad, habitat, genero);
	this.colorEscamas = colorEscamas;
	this.largoCola = largoCola;
	listado.add(this);
	
	
}
	
public Reptil () {
	
	listado.add(this);
	
}

public ArrayList<Reptil> getListado (){
	
	return listado;
	
}

public static int getCantidadReptil(){
	
	return listado.size();
	
}



public String getColorEscamas () {
	
	return colorEscamas;
	
}

public int getLargoCola () {
	
	return largoCola;
	
}

public void setListado (ArrayList<Reptil> listado) {
	
	Reptil.listado = listado;
	
}

public void setColorEscamas (String colorEscamas) {
	
	this.colorEscamas = colorEscamas;
	
}

public void setLargoCola (int largoCola) {
	
	this.largoCola = largoCola;
	
}

@Override
public String movimiento() {
	
	return "reptar";
}

public static Reptil crearIguana(String nombre, int edad, String genero) {
	
	Reptil nuevaIguana = new Reptil (nombre, edad, "humedal", genero, "verde", 3 );
	iguanas++;
	return nuevaIguana;
}

public static Reptil crearSerpiente(String nombre, int edad, String genero) {
	
	Reptil nuevaSerpiente = new Reptil (nombre, edad, "jungla", genero, "blanco", 1 );
	serpientes++;
	return nuevaSerpiente;
}




}
