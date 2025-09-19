package pruebas.prueba03;

import java.util.Random;
import java.util.Scanner;

public class ContraseñaAleatoria {

	final static String CADENA = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_+=";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random rand = new Random();
		int longitud;
		String contrasena = "";

		System.out.println("Dime la longitud de la contraseña");
		longitud = Integer.parseInt(sc.nextLine());

		while (longitud < 8 || longitud > 16) {
			
			System.out.println("Rango no válido, introduzca de nuevo");
			longitud = Integer.parseInt(sc.nextLine());
		}

		for (int i = 0; i < longitud; i++) {
			contrasena += CADENA.charAt(rand.nextInt(CADENA.length()));
		}

		System.out.println("Contraseña: " + contrasena);

		sc.close();
	}

}
