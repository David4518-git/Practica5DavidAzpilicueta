package programa;

import clases.GestorTiendaLibros;

public class Programa {

	public static void main(String[] args) {
		System.out.println("Creamos una tienda");
		GestorTiendaLibros productos = new GestorTiendaLibros();
		System.out.println("Creamos tres productos");
		productos.altaProducto(01, "Libro1", 8.77);
		productos.altaProducto(02, "Libro2", 10.56);
		productos.altaProducto(03, "Libro3", 12.6);
		productos.listarProducto();
		System.out.println();

		System.out.println("Buscamos un producto 02");
		productos.buscarProductos(02);

		System.out.println();
		System.out.println("Creamos 2 clientes");
		productos.altaCliente("Raul", "537846393A", "Raulmartinez2@gmail.com");
		productos.altaCliente("Daniel", "28963494B", "Danielfernandez@gmail4.com");
		productos.listarCliente();
		System.out.println();

		System.out.println("Buscamos a el cliente Raul");
		productos.buscarClientes("537846393A");

		System.out.println();
		System.out.println("Creamos tres Libros fisico");
		productos.altaLibroFisico(04, "Libro4", 22, 200, "Tapa Blanda", 1.5);
		productos.altaLibroFisico(05, "Libro5", 18.65, 120, "Tapa Dura", 1);
		productos.altaLibroFisico(06, "Libro6", 15.45, 150, "Anillas", 1.25);
		productos.listarLibroFisico();
		
		System.out.println();
		productos.buscarLibrosFisicos(05);
		System.out.println();
		
		System.out.println("Creamos tres libros digitales");
		productos.altaLibroDigital(07, "Libro7", 13.57, "MOBI", "500KB", true);
		productos.altaLibroDigital(07, "Libro7", 13.57, "MOBI", "500KB", true);

	}

}
