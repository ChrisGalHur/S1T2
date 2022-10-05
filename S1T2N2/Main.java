package S1T2N2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Nivell 2
		- Exercici 1
		Crea una classe anomenada "Entrada". Aquesta classe ha de servir per controlar els diferents excepcions que podin apar�ixer a Java
		a l�hora d�introduir dades per teclat utilitzant la classe Scanner.
		El primer que s�ha de fer �s instanciar un objecte de la classe Scanner i a partir d�aqu�,
		crear m�todes est�tics per llegir els diferents tipus de dades donis del teclat.
		
		Important
		�s important que si en algun m�tode salta una excepci�, la tractem i tornem a demanar la donada a l�usu�ria fins que aquesta estigui ben introdu�da.
		Per exemple: Si introdueix un float amb un punt en lloc d'amb una coma, ha de mostrar �Error de format�.
		Fins que l�usu�ria no introdueix un float ben format ha de seguir demanant la donada.
		Tots els m�todes reben un String amb el missatge que �s vol mostrar a l�usu�ria, per exemple: �Introdueix la teva edat�,
		i retornin la donada oportuna introdu�da per l�usu�ria en cada m�tode, per exemple: un byte amb l�edat de l�usu�ria.
		
		M�todes a implantar capturant l�excepci� de la classe InputMismatchException:
		public static byte llegirByte(*String missatge);
		public static int llegirInt(*String missatge);
		public static float llegirFloat(*String missatge);
		public static double llegirDouble(*String missatge);
		
		M�todes a implantar capturant l�excepci� de la classe Exception:
		public static char llegirChar(*String missatge);
		public static String llegirString(*String missatge);
		public static boolean llegirSiNo(*String missatge), si l�usuari/*�ria introdueix �s�, retorna �true�, si l�usuari introdueix �n�, retorna �false�.*/
		
		System.out.println("EXAMEN DE PROGRAMACI�N\n"
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
