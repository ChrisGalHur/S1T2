package S1T2N2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada extends Exception{
	
	static Scanner scan = new Scanner(System.in);
	
	private static String msjeEntrada;
	
	private static int inte, intei;
	private static float flo, floi;
	private static double dou, doui;
	private static String cha, chai;
	private static String str, stri;
	
	//Byte
	public static byte leerByte(String msjeEntrada) {
		boolean salida = false;
		byte byt = 0;
		
		do {
			try {
				System.out.println(msjeEntrada);
				byt = scan.nextByte();
				System.out.println("Bien!");
				salida = true;
			} catch (InputMismatchException e) {
				System.out.println("Tenía que ser un Byte");
			}
			scan.nextLine();
		}while(salida == false);
		return byt;
	}
	
	//Integer
	public static Integer leerInt(String msjeEntrada) {
		boolean salida = false;
		int inte = 0;
		
		do {
			try {
				System.out.println(msjeEntrada);
				inte = scan.nextInt();
				System.out.println("Bien!");
				salida = true;
			} catch (InputMismatchException e) {
				System.out.println("Eso no es un Integer...");
			}
			scan.nextLine();
		}while(salida == false);
		return inte;
	}
	
	//Float
	public static float leerFloat(String msjeEntrada) {
		boolean salida = false;
		float flo = 0;
		
		do {
			try {
				System.out.println(msjeEntrada);
				flo = scan.nextFloat();
				System.out.println("Bien!");
				salida = true;
			}catch (InputMismatchException e) {
				System.out.println("Error de formato");
			}
			scan.nextLine();
		}while(salida == false);
		return flo;
	}
	
	//Double
	public static double leerDouble(String msjeEntrada) {
		boolean salida = false;
		double dou = 0;
		
		do {
			try {
				System.out.println(msjeEntrada);
				dou = scan.nextDouble();
				System.out.println("Bien!");
				salida = true;
			}catch (InputMismatchException e) {
				System.out.println("He dicho un Double");
			}
			scan.nextLine();
		}while(salida == false);
		return dou;
	}
	
	//Char
	public static String leerChar(String msjeEntrada) {
		boolean salida = false;
		String cha = null;
		
		do {
			try {
				System.out.println(msjeEntrada);
				cha = scan.next();
					if(cha.length() > 0 && cha.length() < 2) {
						System.out.println("Vale, seguimos!!");
						salida = true;
					}else {
						System.out.println("Es UN char...");
					}
			}catch (Exception e) {
				System.out.println("Pista: Es un char...");
			}
			scan.nextLine();
		}while(salida == false);
		return cha;
	}
	
	//String
	public static String leerString(String msjeEntrada) {
		boolean salida = false;
		String str = "";
		
		do {
			try {
				System.out.println(msjeEntrada);
				str = scan.next();
				System.out.println("Has acabado, felicidades!!!");
				salida = true;
			}catch (Exception e) {
				System.out.println("Este era facil...");
			}
			scan.nextLine();
		}while(salida == false);
		return str;
	}
	
	//S o N
	public static boolean leerSiONo(String msjeEntrada) {
		boolean salida = false;
		boolean comprobante = false;
		char siONo = 0;
		
		do {
			try {
				System.out.println(msjeEntrada);
				siONo = scan.next().toUpperCase().charAt(0);
				comprobante = String.valueOf(siONo).equals("S");//si l’usuari/*ària introdueix “s”, retorna “true”, si l’usuari introdueix “n”, retorna “false”.
				salida = true;
			}catch (Exception e) {
				System.out.println("Eso no es una respuesta!!");
			}
			scan.nextLine();
		}while(salida == false);
		return comprobante;
	}
	
}
	
	

