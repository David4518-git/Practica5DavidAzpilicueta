package clases;

public class LibroFisico extends Productos {
	
	private int numeroPaginas;
	private String tipoEncuadernado;
	private double peso;
	

	public LibroFisico(int codigo, String nombre, double precio,int numeroPaginas,
		               String tipoEncuadernado, double peso) {
		super(codigo, nombre, precio);
		
		this.numeroPaginas=numeroPaginas;
		this.tipoEncuadernado=tipoEncuadernado;
		this.peso=peso;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getTipoEncuadernado() {
		return tipoEncuadernado;
	}

	public void setTipoEncuadernado(String tipoEncuadernado) {
		this.tipoEncuadernado = tipoEncuadernado;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "LibroFisico [numeroPaginas=" + numeroPaginas + ","
				+ " tipoEncuadernado=" + tipoEncuadernado + ", peso="
				+ peso + ", toString()=" + super.toString() + "]";
	}

	// Metodo que le dices el nombre del libro y te dice el precio
	
	public LibroFisico precioSegunLibro(String nombre) {
		
		for (Productos productos : listaProductos) {
			if(productos!=null) {
				if(productos.getNombre().equalsIgnoreCase(nombre)){
					
					return productos.getPrecio();
				}
			}
		}
		
	}
	
	
}
