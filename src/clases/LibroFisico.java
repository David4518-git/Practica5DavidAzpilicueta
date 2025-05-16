package clases;

import java.util.ArrayList;

/**
 * Creamos esta clase y le ponemos la palabra reservado extends para hacerla
 * subClase de la clase Productos Creamos los atributos necesarios y el el
 * arrayList de listaProductos Sobreescribimos el atributo peso de la clase
 * productos y si es mayor de 2 kilos le cambiamos el nombre Hacemos el toString
 * con los atributos de esta clase y el super.toString() que coje los de la
 * clase padre.
 */

public class LibroFisico extends Productos {

	private int numeroPaginas;
	private String tipoEncuadernado;
	private double peso;
	private ArrayList<Productos> listaProductos;
/**
 * Contructor LibroFisico
 * @param codigo Codigo
 * @param nombre Nombre
 * @param precio Precio
 * @param cliente Cliente
 * @param numeroPaginas numeroPaginas
 * @param tipoEncuadernado tipoEncuadernado
 * @param peso Peso
 */
	public LibroFisico(int codigo, String nombre, double precio, Cliente cliente, int numeroPaginas,
			String tipoEncuadernado, double peso) {
		super(codigo, nombre, precio, cliente);
		this.numeroPaginas = numeroPaginas;
		this.tipoEncuadernado = tipoEncuadernado;
		this.peso = peso;

		if (peso > 2.0) {
			setNombre(nombre + " (Libro pesado)");
		}
	}
/**
 * Devuelve numeroPaginas
 * @return numeroPaginas NumeroPaginas
 */
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
/**
 * Establece numeroPaginas 
 * @param numeroPaginas numeroPaginas
 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
/**
 * Devuelve tipoEncuadernado
 * @return tipoEncuadernado tipoEncuadrenado
 */
	public String getTipoEncuadernado() {
		return tipoEncuadernado;
	}
/**
 * Establece tipoEncuadrenado
 * @param tipoEncuadernado tipoEncuadrenado
 */
	public void setTipoEncuadernado(String tipoEncuadernado) {
		this.tipoEncuadernado = tipoEncuadernado;
	}
/**
 * Devuelve peso
 * @return peso Peso
 */
	public double getPeso() {
		return peso;
	}
/**
 * Establece Peso
 * @param peso Peso
 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Creamos el metodo precioSegunLibro que al pasarle el nombre de un libro nos
	 * devuelve el precio de ese libro en particular. Si no coincide al tener que
	 * devolver un numero nos devuleve 0 que seria como un 'no existe'.
	 * 
	 * @param nombre NombreLibro
	 * @return devuelve Devuelve
	 */

	public double precioSegunLibro(String nombre) {
		for (Productos producto : listaProductos) {
			if (producto != null && producto.getNombre().equalsIgnoreCase(nombre)) {
				return producto.getPrecio();
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return "LibroFisico [numeroPaginas=" + numeroPaginas + ", tipoEncuadernado=" + tipoEncuadernado + ", peso="
				+ peso + ", toString()=" + super.toString() + "]";
	}

}
