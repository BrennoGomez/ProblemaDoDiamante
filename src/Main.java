/**
 * 
 * @author BRENO
 * 
 */
public class Main implements InterfaceB, InterfaceC {
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		main.calculadora();
	}
	
	/*
	 * Codigo não compila, dá um erro de métodos com default duplicados.
	 */
}