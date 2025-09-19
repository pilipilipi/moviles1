package pruebas.prueba04;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GestorTareas {

	private static List<Tarea> tareas = new ArrayList<>();
	private Tarea tarea;

	public void agregarTarea(Scanner sc) {
		System.out.println("Dime la descripcion");
		tarea.setDescripcion(sc.nextLine());
		
		System.out.println("Dime la prioridad (1-10)");
		tarea.setPrioridad(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Dime si está completada, si/no");
		if(sc.nextLine().equalsIgnoreCase("si")) {
			tarea.setCompletada(true);
			
		} else if (sc.nextLine().equalsIgnoreCase("no")){
			tarea.setCompletada(false);
		}
		
		tareas.add(tarea);
	}

	public void eliminarTarea(int index) {

		try {
			tareas.remove(index);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Indice no valido \n");
		}
	}

	public void buscarPorPrioridad(int pr) {

		for (Tarea tarea : tareas) {

			if (pr == tarea.getPrioridad()) {
				System.out.println(tarea + "\n");
			}
		}
	}

	public void buscarPorDescripcion(String desc) {

		for (Tarea tarea : tareas) {

			if (desc == tarea.getDescripcion()) {
				System.out.println(tarea + "\n");
			}
		}
	}
	
	public void buscarPorEstado(boolean comp) {

		for (Tarea tarea : tareas) {

			if (comp == tarea.isCompletada()) {
				System.out.println(tarea + "\n");
			}
		}
	}
	
	public void mostrar() {
		
		for(Tarea tarea: tareas) {
			System.out.println(tarea + "\n");
		}
	}

}
