package clases;

import java.util.ArrayList;

public class Productos {
	
	private int codigo;
	private String nombre;
	private double precio;
	Cliente cliente;
    ArrayList<Productos> listaProductos;
	
	
	
	public Productos(int codigo, String nombre, double precio) {
		
		this.codigo=codigo;
		this.nombre=nombre;
		this.precio=precio;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
		this.precio = precio;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Productos> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Productos> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	@Override
	public String toString() {
		return "Productos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", cliente=" + cliente
				+ ", listaProductos=" + listaProductos + "]";
	}
	
	//Calcula el precio de todos los productos de la tienda

	public double precioProductos () {
		
		double precioTotal=0;
		for (Productos producto : listaProductos) {
			precioTotal+=producto.getPrecio();
		}
		
		return precioTotal;
	}
	
}
