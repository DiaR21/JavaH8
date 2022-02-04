package metodos;

public class PruebaMetodos {

	public static void main(String[] args) {
		Metodos metodo = new Metodos();
		
		metodo.a = 10;
		metodo.b = 26;
		
		metodo.sumar(); // invocamos el método void
		
		//este tipo de métodos, se pueden almacenar dentro de una variable
		int resultadoSuma = metodo.sumaConRetorno();
		System.out.println(resultadoSuma - 10); // método con retorno
		
		// método con argumentos
		double multiplicacion = metodo.multiplicarConArgumentos(40, 20.5);
		System.out.println("El resultado de la multiplicación es " + multiplicacion);
	}
}
