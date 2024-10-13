package parte3condicionales;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		/*
		 * Casos de >pruebas:
		 * Prueba 1: 8 - 2023 -> El mes 8 del año 2023 tiene 31 días.
		 * Pueba 2: 2 - 2023 -> El mes 2 del año 2023 tiene 28 días.
		 * Prueba 3: 2 - 2024 -> El mes 2 del año 2023 tiene 29 días.
		 */
		
		// Pedimos al usuario un numero de mes y el año.
		int mes;
		
		int anio;
		
		// Ceamos una variable para recoger los dias de cada mes.
		int dias = 0;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
		
		// Solicitamos el nuemo de mes.
		System.out.println("Introduzca el numero de mes:");
		
		// Leemos del teclado.
		mes = sc.nextInt();
		
		// Solicitamos el año.
		System.out.println("Introduzca el año:");
		
		// Leemos del teclado.
		anio = sc.nextInt();
		
		// Comprobamos si es bisiesto.
		boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
		
		 // Determinamos el número de días según el mes
        switch (mes) {
            case 1:  // Enero
            case 3:  // Marzo
            case 5:  // Mayo
            case 7:  // Julio
            case 8:  // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4:  // Abril
            case 6:  // Junio
            case 9:  // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;
            case 2:  // Febrero
                if (esBisiesto) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                System.out.println("El número del mes introducido no es válido.");
                return; 
        }

        // Mostrar el número de días del mes
        System.out.println("El mes " + mes + " del año " + anio + " tiene " + dias + " días.");

		
		
		// Cerramos el nuevo Scanner.
		sc.close();

	}

}
