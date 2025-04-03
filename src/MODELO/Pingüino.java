package MODELO;

public class Pingüino {

	String color;
	String nombre;
	int id;
	
	public Pingüino(int id, String nombre, String color) {
		this.id = id;
		this.nombre = nombre;
		this.color = color;
	}
	
	public String toString() {
		return nombre;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}	
}
