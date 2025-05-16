package clases;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Creamos dos ArrayList, uno para los clientes y otro para los Productos
 */
public class GestorTiendaLibros {

	private ArrayList<Cliente> listaClientes;
	private ArrayList<Productos> listaProductos;
	/**
	 * Constructor GestionTiendaLibros
	 */
	public GestorTiendaLibros() {
		listaClientes = new ArrayList<>();
		listaProductos = new ArrayList<>();
	}

	/**
	 * Damos de alta el cliente con todos sus atributos y lo anadimos a la lista
	 * @param nombre Nombre del Cliente
	 * @param dni    Dni del cliente
	 * @param email  Email del Cliente
	 * @param edad   edad del Cliente
	 */
	public void altaCliente(String nombre, String dni, String email, int edad) {
		Cliente nuevoCliente = new Cliente(nombre, dni, email, edad);
		listaClientes.add(nuevoCliente);
	}

	/**
	 * Listamos los clientes usando un for convencional
	 */
	public void listarClientes() {
		for (int i = 0; i < listaClientes.size(); i++) {
			System.out.println(listaClientes.get(i));
		}
	}

	/**
	 * Buscamos los clientes segun su dni
	 * 
	 * @param dni Dni del cliente
	 * @return devuelve
	 */
	public Cliente buscarCliente(String dni) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getDni().equalsIgnoreCase(dni)) {
				return cliente;
			}
		}
		return null;
	}

	/**
	 * Eliminamos los clientes usando el Iterator
	 * 
	 * @param dni Dni del cliente
	 */
	public void eliminarCliente(String dni) {
		Iterator<Cliente> iterator = listaClientes.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getDni().equalsIgnoreCase(dni)) {
				iterator.remove();
			}
		}
	}

	/**
	 * Damos de alta librosFisicos y los anadimos a la lista de Productos
	 * 
	 * @param codigo           Codigo Producto
	 * @param nombre           Nombre Producto
	 * @param precio           Precio
	 * @param cliente          Cliente
	 * @param numeroPaginas    NumeroPaginas
	 * @param tipoEncuadernado TipoEncuadernado
	 * @param peso             Peso
	 */
	public void altaLibroFisico(int codigo, String nombre, double precio, Cliente cliente, int numeroPaginas,
			String tipoEncuadernado, double peso) {
		LibroFisico libroFisico = new LibroFisico(codigo, nombre, precio, cliente, numeroPaginas, tipoEncuadernado,
				peso);
		listaProductos.add(libroFisico);
	}

	/**
	 * Damos de alta librosDigitales y los anadimos a la lista de Productos
	 * 
	 * @param codigo        Codigo Producto
	 * @param nombre        Nombre Producto
	 * @param precio        Precio
	 * @param cliente       Cliente
	 * @param formato       Formato
	 * @param tamanoArchivo TamanoArchivo
	 * @param proteccionDrm ProteccionDrm
	 */
	public void altaLibroDigital(int codigo, String nombre, double precio, Cliente cliente, String formato,
			String tamanoArchivo, boolean proteccionDrm) {
		LibroDigital libroDigital = new LibroDigital(codigo, nombre, precio, cliente, formato, tamanoArchivo,
				proteccionDrm);
		listaProductos.add(libroDigital);
	}

	/**
	 * Listamos los libros con el for convencional
	 */
	public void listarLibros() {
		for (int i = 0; i < listaProductos.size(); i++) {
			System.out.println(listaProductos.get(i));
		}
	}

	/**
	 * Buscamos los productos segun el codigo
	 * 
	 * @param codigo Codigo
	 * @return devuelve
	 */
	public Productos buscarLibro(int codigo) {
		for (Productos producto : listaProductos) {
			if (producto.getCodigo() == codigo) {
				return producto;
			}
		}
		return null;
	}

	/**
	 * Eliminamos Producto usando el Iterator
	 * 
	 * @param codigo Codigo
	 */
	public void eliminarLibro(int codigo) {
		Iterator<Productos> iterator = listaProductos.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getCodigo() == codigo) {
				iterator.remove();
			}
		}
	}

	/**
	 * Creamos un metodo que llama a el metodo buscarLibro, eliminarLibro y
	 * listarLibro Usamos try catch por si este metodo no encuentra el libro En ese
	 * caso lanza el mensaje correspondiente.
	 * 
	 * @param codigo Codigo
	 */
	public void buscarEliminarYListarLibro(int codigo) {
		try {
			Productos libro = buscarLibro(codigo);

			if (libro != null) {
				eliminarLibro(codigo);
				System.out.println("Libro eliminado correctamente");
			} else {
				System.out.println("Libro no encontrado. No se puede eliminar");
			}

			listarLibros();
		} catch (Exception e) {
			System.out.println("Error al eliminar libro: " + e.getMessage());
		}
	}

	/**
	 * Creamos un metodo que llama a los metodos buscarCliente y buscarLibro Si
	 * existen se muestra tanto el cliente como el libro
	 * 
	 * @param dni         Dni
	 * @param codigoLibro CodigoLibro
	 */
	public void mostrarClienteLibro(String dni, int codigoLibro) {
		try {
			Cliente cliente = buscarCliente(dni);
			Productos libro = buscarLibro(codigoLibro);

			if (cliente != null && libro != null) {
				System.out.println("Cliente encontrado: " + cliente);
				System.out.println("Libro encontrado: " + libro);
			} else {
				System.out.println("No se encontro el cliente o el libro.");
			}
		} catch (Exception e) {
			System.out.println("Error al buscar cliente o libro: " + e.getMessage());
		}
	}

}
