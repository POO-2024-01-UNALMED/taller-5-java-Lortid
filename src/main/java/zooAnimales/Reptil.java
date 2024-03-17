package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	
	private ArrayList <Reptil> listado = new ArrayList<Reptil>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
public Reptil (String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
	
	super( nombre, edad, habitat, genero);
	this.colorEscamas = colorEscamas;
	this.largoCola = largoCola;
	this.listado.add(this);
	
}
	
public Reptil () {
	
}

public ArrayList<Reptil> getListado (){
	
	return listado;
	
}

public String getColorEscamas () {
	
	return colorEscamas;
	
}

public int getLargoCola () {
	
	return largoCola;
	
}

public void setListado (ArrayList<Reptil> listado) {
	
	this.listado = listado;
	
}

public void setColorEscamas (String colorEscamas) {
	
	this.colorEscamas = colorEscamas;
	
}

public void setLargoCola (int largoCola) {
	
	this.largoCola = largoCola;
	
}

public String movimiento() {
	
	return "reptar";
}

public Reptil crearIguana(String nombre, int edad, String genero) {
	
	Reptil nuevaIguana = new Reptil (nombre, edad, "humedal", genero, "verde", 3 );
	iguanas++;
	return nuevaIguana;
}

public Reptil crearSerpiente(String nombre, int edad, String genero) {
	
	Reptil nuevaSerpiente = new Reptil (nombre, edad, "jungla", genero, "blanco", 1 );
	serpientes++;
	return nuevaSerpiente;
}

}
