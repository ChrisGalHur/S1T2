package S1T2N1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws VentaVaciaException {
		/*Nivel 1
		- Ejercicio 1
		-Crea una clase llamada "Producto" con los atributos nombre y precio, y otra clase llamada "Venta". 
		-Esta clase tiene como atributos una colecci�n de productos y el precio total de la venta.
		-La clase "Venta", tiene un m�todo llamado calcularTotal() que lanza la excepci�n personalizada VendaBuidaException y muestra por pantalla
		-�Para hacer una venta primero tienes que a�adir productos� si la colecci�n de productos est� vac�a. Si la colecci�n tiene productos, 
		-entonces tiene que recorrer la colecci�n y guardar la suma de todos los precios de los productos al atributo precio total de la venta.
		
		-La excepci�n personalizada VendaBuidaException tiene que ser hija de la clase Exception. A su constructor le tenemos que pasar el mensaje
		�Para hacer una venta primero tienes que a�adir productos� y cuando capturamos la excepci�n, lo tenemos que mostrar por pantalla con el m�todo getMessage() de la excepci�n.
		
		Escribe el c�digo necesario para generar y capturar una excepci�n de tipo ArrayIndexOutOfBoundsException.*/
		
		//Creamos un objeto venta
		Venta enero = new Venta();
		
		//Llamamos a calcularTotal() con ArrayList vac�o (si se quita como comentario funciona)
		try {
			Venta.calcularTotal();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
				
		
		Producto sofa1 = new Producto("Eskilstuna", 899);
		Producto sofa2 = new Producto("Ektorp", 599);
		Producto cajonera1 = new Producto("Alex", 88);

		enero.a�adirAlArrayList(sofa1);
		enero.a�adirAlArrayList(sofa2);
		enero.a�adirAlArrayList(cajonera1);
		
		try {
			enero.calcularTotal();
		} catch (VentaVaciaException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
