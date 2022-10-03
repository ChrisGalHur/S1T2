package S1T2N1;

import java.util.ArrayList;

public class Venta {

	
	//Atributos
	private static int precioTotalVenta;
	private static ArrayList<Producto> productos;
	
	
	//Constructor
	public Venta() {
		this.productos = new ArrayList<Producto>();
	}
	
	//Getters
	public static ArrayList<Producto> getProductos() {
		return productos;
	}

	//Setters
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	//Métodos
	public void añadirAlArrayList(Producto a) {
		productos.add(a);
	}
	
	
	public static void calcularTotal() throws VentaVaciaException{
		
		if(productos.size() == 0) {
			throw new VentaVaciaException("Para hacer una venta primero tienes que añadir productos");
			
		}else {
			for(int i = 0; i < productos.size(); i++) {
				precioTotalVenta += productos.get(i).getPrecio();
			}		
		}
		System.out.println(precioTotalVenta);
	}
}