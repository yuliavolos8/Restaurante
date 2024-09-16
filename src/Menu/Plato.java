package Menu;

import java.util.ArrayList;

public class Plato {
	private String nombre;
	private double precio;
	private ArrayList<String> ingredientes;

	public Plato(String nombre, double precio, ArrayList<String> ingredientes) {

		this.nombre = nombre;
		this.precio = precio;
		this.ingredientes = ingredientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", precio=" + precio + ", ingredientes=" + ingredientes + "]";
	}

}
