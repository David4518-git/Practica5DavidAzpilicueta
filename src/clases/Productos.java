package clases;

import java.util.ArrayList;

/**
 * Creamos los atributos de la clase Productos Le pasamos la clase Cliente para
 * poder liguar despues los Productos con los Clientes Y creamos un arrayList de
 * los Productos para poder crear el metodo Inicializamos todos los atributos en
 * el contructor El arrayList no se pasa pero se inicializa
 */
public class Productos {

	private int codigo;
	private String nombre;
	private double precio;
	private Cliente cliente;
	private ArrayList<Productos> listaProductos;

	/**
	 * Iniciamos constructor con atributos
	 * 
	 * @param codigo  CodigoProducto
	 * @param nombre  NombreProducto
	 * @param precio  PrecioProducto
	 * @param cliente Cliente
	 */

	public Productos(int codigo, String nombre, double precio, Cliente cliente) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cliente = cliente;
		this.listaProductos = new ArrayList<>();
	}
/**
 * Devuelve el codigoProducto
 * @return codigo codigoProducto
 */
	public int getCodigo() {
		return codigo;
	}
/**
 * Establece CodigoProducto
 * @param codigo CodigoProducto
 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
/**
 * Devulve nombreProducto
 * @return nombre nombreProducto
 */
	public String getNombre() {
		return nombre;
	}
/**
 * Establece nombreProducto
 * @param nombre nombreProducto
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Devuelve precioProducto
 * @return precio precioProducto
 */
	public double getPrecio() {
		return precio;
	}
/**
 * Establece precioProducto
 * @param precio precioProducto
 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
/**
 * Devuelve ClienteProducto
 * @return cliente ClienteProducto
 */
	public Cliente getCliente() {
		return cliente;
	}
/**
 * Establece ClienteProducto 
 * @param cliente ClienteProducto
 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
/**
 * Devuelve listaProductos
 * @return listaProductos ListaProductos
 */
	public ArrayList<Productos> getListaProductos() {
		return listaProductos;
	}
/**
 * Establece listaProductos
 * @param listaProductos ListaProductos
 */
	public void setListaProductos(ArrayList<Productos> listaProductos) {
		this.listaProductos = listaProductos;
	}

	/**
	 * Creamos un metodo calcularPrecioTotal que recorre la lista de Productos Y nos
	 * va sumando el precio total de todos los productos por tanto nos devuelve
	 * cuanto valen todos los Productos de la tienda
	 * 
	 * @return Devuelve
	 */
	public double calcularPrecioTotal() {
		double total = 0.0;
		for (Productos producto : listaProductos) {
			total += producto.getPrecio();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Productos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", cliente=" + cliente
				+ ", listaProductos=" + listaProductos + "]";
	}

}
