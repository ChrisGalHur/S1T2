package S1T2N1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws VentaVaciaException {
		/*Nivel 1
		- Ejercicio 1
		-Crea una clase llamada "Producto" con los atributos nombre y precio, y otra clase llamada "Venta". 
		-Esta clase tiene como atributos una colección de productos y el precio total de la venta.
		-La clase "Venta", tiene un método llamado calcularTotal() que lanza la excepción personalizada VendaBuidaException y muestra por pantalla
		-“Para hacer una venta primero tienes que añadir productos” si la colección de productos está vacía. Si la colección tiene productos, 
		-entonces tiene que recorrer la colección y guardar la suma de todos los precios de los productos al atributo precio total de la venta.
		
		-La excepción personalizada VendaBuidaException tiene que ser hija de la clase Exception. A su constructor le tenemos que pasar el mensaje
		“Para hacer una venta primero tienes que añadir productos” y cuando capturamos la excepción, lo tenemos que mostrar por pantalla con el método getMessage() de la excepción.
		
		Escribe el código necesario para generar y capturar una excepción de tipo ArrayIndexOutOfBoundsException.*/
		
		//Creamos un objeto venta
		Venta enero = new Venta();
		
		//Llamamos a calcularTotal() con ArrayList vacío (si se quita como comentario funciona)
		try {
			Venta.calcularTotal();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
				
		
		Producto sofa1 = new Producto("Eskilstuna", 899);
		Producto sofa2 = new Producto("Ektorp", 599);
		Producto cajonera1 = new Producto("Alex", 88);

		enero.añadirAlArrayList(sofa1);
		enero.añadirAlArrayList(sofa2);
		enero.añadirAlArrayList(cajonera1);
		
		try {
			enero.calcularTotal();
		} catch (VentaVaciaException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
