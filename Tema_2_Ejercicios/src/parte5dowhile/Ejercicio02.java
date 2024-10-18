package parte5dowhile;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Variable que recogera los numeros.
		int contador = 0;

		// Creamos el bucle do while.
		do {
			// Aumentamos el numero.
			contador++;
			
			if (contador % 2 == 0) {
				// Imprimimos en pantalla.
				System.out.println(contador);
			}
			

			// Condicion del while.
		} while (contador < 200);

	}

}
