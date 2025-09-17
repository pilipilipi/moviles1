package pruebas.prueba01;

public class Producto {

	String nombre;
	double precio;
	int stock;

	Producto(String nombre, double precio, int stock) {

		this.nombre = nombre;

		if (precio < 0 || stock < 0) {
			System.out.println("error");

		} else {
			this.precio = precio;
			this.stock = stock;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {

		if (precio < 0) {
			System.out.println("error");

		} else {
			this.precio = precio;
		}
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {

		if (stock < 0) {
			System.out.println("error");

		} else {
			this.stock = stock;
		}
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}
	

}
