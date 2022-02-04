package metodos;

public class Metodos {

	// Método es una función
	// atributos de la clase
	int a, b;
	
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + " más " + b + " es " + resultado);
		
	}
	
	public int sumaConRetorno() {
		return a + b;
	}
	
	// argumentos
	// suma(argumentos)
	public int multiplicarConArgumentos(int arg1, double arg2) {
		int c = arg1;
		double d = arg2;
		// hay que castear porque el resultado es double
		return (int) (c * d);
	}
	
	// método estático
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre);
	}
}
