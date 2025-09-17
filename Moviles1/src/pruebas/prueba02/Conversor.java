package pruebas.prueba02;

import java.util.Scanner;

public class Conversor {
	
	final static double TIPO_CAMBIO = 1.08;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion = 0;

		do {
			try {

				System.out.println("Que quieres convertir?" + "\n1. Metros a Centímetros" + "\n2. Kilogramos a Gramos"
						+ "\n3. Euros a Dólares" + "\n4. Salir");
				opcion = Integer.parseInt(sc.nextLine());
				
				 if (opcion < 1 || opcion > 4) {
	                    throw new OpcionIncorrectaException("La opción " + opcion + " no es válida. Elige entre 1 y 4.");
	                }

				switch (opcion) {
				case 1:
					System.out.println("Dime los metros");
					opcion1(Double.parseDouble(sc.nextLine()));
					break;

				case 2:
					System.out.println("Dime los kg");
					opcion2(Double.parseDouble(sc.nextLine()));
					break;

				case 3:
					System.out.println("Dime los euros");
					opcion3(Double.parseDouble(sc.nextLine()));
					break;

				case 4:
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("No has introducido un numero");
				
			} catch (OpcionIncorrectaException e) {
				System.out.println(e.getMessage());
			}

		} while (opcion != 4);

		sc.close();
	}

	public static double opcion1(double metros) {

		return metros * 100;
	}

	public static double opcion2(double kg) {

		return kg * 1000;
	}

	public static double opcion3(double euro) {

		return euro * TIPO_CAMBIO;
	}

}
