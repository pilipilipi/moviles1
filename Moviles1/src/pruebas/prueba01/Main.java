package pruebas.prueba01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		double precioTotal = 0;
		List<Producto> productos = new ArrayList<>();
		Producto p1 = new Producto("Botellas", 5.3, 4);
		Producto p2 = new Producto("Lololo", 3.9, 8);
		Producto p3 = new Producto("pupup", 22, 7);
		Producto p4 = new Producto("iaidhfhfg", 67, 7);
		Producto p5 = new Producto("skla", 56, 5);
		
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		productos.add(p5);
		
		for (Producto producto : productos) {
			System.out.println(producto);
			precioTotal += (producto.getPrecio() * producto.getStock());
		}
		
		System.out.println(precioTotal);
	}

}
