package gestion;
import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<>();

	
public Zoologico (String nombre, String ubicacion) {
	
	this.nombre = nombre;
	this.ubicacion = ubicacion;

}

public Zoologico() {
	
	this(null, null);
	
}

public String getNombre () {
	
	return nombre;
}

public String getUbicacion () {
	
	return ubicacion;
	
}

public ArrayList<Zona> getZona () {
	
	return zonas;
}

public void setNombre (String nombre) {
	
	this.nombre = nombre;
}

public void setUbicacion (String ubicacion) {
	
	this.ubicacion = ubicacion;
	
}

public void setZona (ArrayList<Zona> zonas) {
	
	this.zonas = zonas;
	
}

public void agregarZonas(Zona zonas) {
	
	this.zonas.add(zonas);
	
	
}

public int cantidadTotalAnimales() {
	
	int cant = 0;
	
	for (int i =0; i< zonas.size(); i++) {
		 
		cant += zonas.get(i).getAnimales().size();
		
		
}
	
	return cant;
			
	}
	
	
}


	
	
	
	
	
	


