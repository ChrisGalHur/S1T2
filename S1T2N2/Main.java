package S1T2N2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Nivell 2
		- Exercici 1
		Crea una classe anomenada "Entrada". Aquesta classe ha de servir per controlar els diferents excepcions que podin aparèixer a Java
		a l’hora d’introduir dades per teclat utilitzant la classe Scanner.
		El primer que s’ha de fer és instanciar un objecte de la classe Scanner i a partir d’aquí,
		crear mètodes estàtics per llegir els diferents tipus de dades donis del teclat.
		
		Important
		És important que si en algun mètode salta una excepció, la tractem i tornem a demanar la donada a l’usuària fins que aquesta estigui ben introduïda.
		Per exemple: Si introdueix un float amb un punt en lloc d'amb una coma, ha de mostrar “Error de format”.
		Fins que l’usuària no introdueix un float ben format ha de seguir demanant la donada.
		Tots els mètodes reben un String amb el missatge que és vol mostrar a l’usuària, per exemple: “Introdueix la teva edat”,
		i retornin la donada oportuna introduïda per l’usuària en cada mètode, per exemple: un byte amb l’edat de l’usuària.
		
		Mètodes a implantar capturant l’excepció de la classe InputMismatchException:
		public static byte llegirByte(*String missatge);
		public static int llegirInt(*String missatge);
		public static float llegirFloat(*String missatge);
		public static double llegirDouble(*String missatge);
		
		Mètodes a implantar capturant l’excepció de la classe Exception:
		public static char llegirChar(*String missatge);
		public static String llegirString(*String missatge);
		public static boolean llegirSiNo(*String missatge), si l’usuari/*ària introdueix “s”, retorna “true”, si l’usuari introdueix “n”, retorna “false”.*/
		
		System.out.println("EXAMEN DE PROGRAMACIÓN\n"
				+ "");
		//Byte
		System.out.println(Entrada.leerByte("Dime un Byte:"));
		//Integer
		System.out.println(Entrada.leerInt("Dame un Integer:"));
		//Float
		System.out.println(Entrada.leerFloat("Un Float:"));
		//Double
		System.out.println(Entrada.leerDouble("Ahora un Double"));
		//Char
		System.out.println(Entrada.leerChar("Dame un char:"));
		//String
		System.out.println(Entrada.leerString("Dime un String:"));
		//SiNo
		System.out.println(Entrada.leerSiONo("Te ha gustado el examen? S/N"));
		
	}

}
