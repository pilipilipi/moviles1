package pruebas.prueba04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		GestorTareas g1 = new GestorTareas();
		
		do {
			System.out.println("Elige opcion\n" 
					+ "1. Agregar una nueva tarea.\n"
					+ "2. Eliminar una tarea (por su número de lista).\n"
					+ "3. Buscar una tarea por prioridad.\n"
					+ "4. Buscar una tarea por descripción.\n"
					+ "5. Buscar una tarea por estado.\n"
					+ "6. Mostrar todas las tareas.\n"
					+ "7. Meter las tareas en un fichero\n"
					+ "8. Salir del programa");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			
			case 1:
				g1.agregarTarea(sc);			
				break;
			
			case 2: 
				g1.eliminarTarea(sc);
				break;
				
			case 3:
				g1.buscarPorPrioridad(sc);
				break;
				
			case 4:
				g1.buscarPorDescripcion(sc);
				break;
				
			case 5: 
				g1.buscarPorEstado(sc);
				break;
				
			case 6:
				g1.mostrar();
				break;
				
			case 7:
				g1.meterFichero();
				break;
				
			case 8:
				System.out.println("Terminado");
				break;
				
			default:
				System.out.println("Opcion no valida");
				break;
			}
			
		} while(opcion != 8);
		
		sc.close();
		
	}

}
