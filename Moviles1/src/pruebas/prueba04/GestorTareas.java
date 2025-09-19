package pruebas.prueba04;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GestorTareas {

	private List<Tarea> tareas;

    public GestorTareas() {
        tareas = new ArrayList<>();
    }

	public void agregarTarea(Scanner sc) {
		System.out.println("Dime la descripcion");
		String descripcion = sc.nextLine();
		
		System.out.println("Dime la prioridad (1-10)");
		int prioridad = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime si está completada, si/no");
		String comp = sc.nextLine();
		boolean completada = false;
		
		if(comp.equalsIgnoreCase("si")) {
			completada = true;
		}
		
		this.tareas.add(new Tarea(descripcion, prioridad, completada));
	}

	public void eliminarTarea(Scanner sc) {
		
		System.out.println("Dime el indice");
		int index = Integer.parseInt(sc.nextLine());
		
		try {
			this.tareas.remove(index - 1);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Indice no valido \n");
		}
	}

	public void buscarPorPrioridad(Scanner sc) {
		
		System.out.println("Dime la prioridad");
		int pr = Integer.parseInt(sc.nextLine());

		for (Tarea tarea : tareas) {

			if (pr == tarea.getPrioridad()) {
				System.out.println(tarea + "\n");
			}
		}
	}

	public void buscarPorDescripcion(Scanner sc) {

		System.out.println("Dime la descripcion");
		String desc = sc.nextLine();
		
		for (Tarea tarea : this.tareas) {

			if (desc.equalsIgnoreCase(tarea.getDescripcion())) {
				System.out.println(tarea + "\n");
			}
		}
	}
	
	public void buscarPorEstado(Scanner sc) {

		System.out.println("Dime si se ha completado, si/no");
		String c = sc.nextLine();
		boolean comp = false;
		
		if (c.equalsIgnoreCase("si")) {
			comp = true;
		}
		
		for (Tarea tarea : this.tareas) {

			if (comp == tarea.isCompletada()) {
				System.out.println(tarea + "\n");
			}
		}
	}
	
	public void mostrar() {
		
		for(Tarea tarea: this.tareas) {
			System.out.println(tarea + "\n");
		}
	}

}
