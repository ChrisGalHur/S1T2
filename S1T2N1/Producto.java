package S1T2N1;

public class Producto {
	
	//Atributos
	private String nombre;
	private int precio ;
	
	public Producto(String nombre, int precio) {;
		this.nombre = nombre;
		this.precio = precio;
	}

	//Getters
	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
