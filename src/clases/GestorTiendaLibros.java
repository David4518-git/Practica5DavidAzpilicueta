package clases;

import java.util.ArrayList;
import java.util.Iterator;

public class GestorTiendaLibros {

	private ArrayList<Cliente> listaClientes;
	private ArrayList<LibroFisico> listaLibroFisico;
	private ArrayList<LibroDigital> listaLibroDigital;
	private ArrayList<Productos> listaProductos;

	public GestorTiendaLibros() {

		listaClientes = new ArrayList<Cliente>();
		listaLibroFisico = new ArrayList<LibroFisico>();
		listaLibroDigital = new ArrayList<LibroDigital>();
		listaProductos = new ArrayList<Productos>();

	}

	public void altaCliente(String nombre, String dni, String email) {

		Cliente nuevoCliente = new Cliente(nombre, dni, email);
		listaClientes.add(nuevoCliente);
	}

	public void listarCliente() {

		for (Cliente cliente : listaClientes) {
			if (cliente != null) {
				System.out.println(cliente);
			}
		}
	}

	public Cliente buscarClientes(String dni) {

		for (Cliente cliente : listaClientes) {
			if (cliente != null) {
				if (cliente.getNombre().equals(dni));
				return cliente;
			}
		}

		return null;
	}

	public void eliminarCliente(String dni) {

		Iterator<Cliente> iteradorCliente = listaClientes.iterator();
		while (iteradorCliente.hasNext()) {
			Cliente cliente = iteradorCliente.next();
			if (cliente.getDni().equals(dni)) {
				iteradorCliente.remove();
			}
		}
	}

	public void altaProducto(int codigo, String nombre, double precio) {

		Productos nuevoProducto = new Productos(codigo, nombre, precio);
		listaProductos.add(nuevoProducto);
	}

	public void listarProducto() {

		for (Productos producto : listaProductos) {
			if (producto != null) {
				System.out.println(producto);
			}
		}
	}

	public Productos buscarProductos(int codigo) {

		for (Productos producto : listaProductos) {
			if (producto != null) {
				if (producto.getCodigo() == codigo) {
					return producto;
				}
			}
		}

		return null;
	}

	public void eliminarProductos(int codigo) {

		Iterator<Productos> iteradorProductos = listaProductos.iterator();
		while (iteradorProductos.hasNext()) {
			Productos producto = iteradorProductos.next();
			if (producto.getCodigo() == codigo) {
				iteradorProductos.remove();
			}
		}

	}

	public void altaLibroFisico(int codigo, String nombre, double precio, int numeroPaginas, String tipoEncuadernado,
			double peso) {

		LibroFisico nuevoLibroFisico = new LibroFisico(codigo, nombre, precio, numeroPaginas, tipoEncuadernado, peso);
		listaLibroFisico.add(nuevoLibroFisico);

	}

	public void listarLibroFisico() {

		for (LibroFisico libroFisico : listaLibroFisico) {
			if (libroFisico != null) {
				System.out.println(libroFisico);
			}
		}
	}

	public LibroFisico buscarLibrosFisicos(int codigo) {

		for (LibroFisico libroFisico : listaLibroFisico) {
			if (libroFisico != null) {
				if (libroFisico.getCodigo() == codigo) {
					return libroFisico;
				}
			}
		}

		return null;
	}

	public void altaLibroDigital(int codigo, String nombre, double precio, String formato, String tamanoArchivo,
			boolean proteccionDrm) {

		LibroDigital nuevoLibroDigital = new LibroDigital(codigo, nombre, precio, formato, tamanoArchivo,
				proteccionDrm);

		listaLibroDigital.add(nuevoLibroDigital);

	}

	public void listarLibroDigital() {

		for (LibroDigital libroDigital : listaLibroDigital) {
			if (libroDigital != null) {
				System.out.println(libroDigital);
			}
		}
	}

	public LibroDigital buscarLibrosDigital(int codigo) {

		for (LibroDigital libroDigital : listaLibroDigital) {
			if (libroDigital != null) {
				if (libroDigital.getCodigo() == codigo) {
					return libroDigital;
				}
			}
		}

		return null;
	}

}
