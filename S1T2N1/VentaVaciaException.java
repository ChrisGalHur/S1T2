package S1T2N1;

public class VentaVaciaException extends Exception{

	public VentaVaciaException(){}
	
	public VentaVaciaException(String errorArrayVacio) {
		super(errorArrayVacio);
	}
	
}
