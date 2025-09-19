package pruebas.prueba04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		GestorTareas g1;
		
		do {
			System.out.println("Elige opcion " 
					+ "1. Agregar una nueva tarea.\n"
					+ "2. Eliminar una tarea (por su número de lista).\n"
					+ "3. Buscar una tarea por prioridad.\n"
					+ "4. Buscar una tarea por descripción.\n"
					+ "5. Buscar una tarea por estado.\n"
					+ "6. Mostrar todas las tareas.\n"
					+ "4. Salir del programa");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			
			case 1:
				g1.agregarTarea(sc);				
				break;
			}
			
		} while(opcion != 4);
		
	}

}
