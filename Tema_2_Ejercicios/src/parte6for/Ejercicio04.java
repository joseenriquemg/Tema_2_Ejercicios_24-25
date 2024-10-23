package parte6for;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Variable que sumara los numeros impares.
		int suma = 0;

		for (int i = 0; i <= 20; i++) {

			if (i % 2 != 0) {

				suma += i;

			}
		}

		System.out.println("La suma de los 10 primeros numeros impares resulta: " + suma);

	}

}
