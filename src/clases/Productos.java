package clases;

public class Productos {
	
	private int codigo;
	private String nombre;
	private double precio;
	Cliente cliente;
	
	
	public Productos() {
		
		this.codigo=0;
		this.nombre="";
		this.precio=0.0;
	}
	
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

	@Override
	public String toString() {
		
		return "Productos -> codigo= " + codigo + ","
		+ " nombre= " + nombre + ", precio= " + precio;
	}

	
}
