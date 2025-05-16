package clases;
/**
 * Creamos el LibroDigital
 */
public class LibroDigital extends Productos {

	private String formato;
	private String tamanoArchivo;
	private boolean proteccionDrm;
/**
 * Constructor LibroDigital
 * @param codigo Codigo
 * @param nombre Nombre
 * @param precio Precio
 * @param cliente Cliente
 * @param formato Formato
 * @param tamanoArchivo TamanoArchivo
 * @param proteccionDrm ProteccionDrm
 */
	public LibroDigital(int codigo, String nombre, double precio, Cliente cliente, String formato, String tamanoArchivo,
			boolean proteccionDrm) {
		super(codigo, nombre, precio, cliente);
		this.formato = formato;
		this.tamanoArchivo = tamanoArchivo;
		this.proteccionDrm = proteccionDrm;
	}
/**
 * Devuelve formato
 * @return formato Formato LibroDigital
 */
	public String getFormato() {
		return formato;
	}
/**
 * Establece formato
 * @param formato Formato
 */
	public void setFormato(String formato) {
		this.formato = formato;
	}
/**
 * Devuelve tamanoArchivo
 * @return tamanoArchivo tamanoArchivo
 */
	public String getTamanoArchivo() {
		return tamanoArchivo;
	}
/**
 * Establece tamanoArchivo
 * @param tamanoArchivo TamanoArchivo
 */
	public void setTamanoArchivo(String tamanoArchivo) {
		this.tamanoArchivo = tamanoArchivo;
	}
/**
 * Devuleve proteccionDrm
 * @return proteccionDrm ProteccionDrm
 */
	public boolean isProteccionDrm() {
		return proteccionDrm;
	}
/**
 * Establece proteccionDrm
 * @param proteccionDrm ProteccionDrm
 */
	public void setProteccionDrm(boolean proteccionDrm) {
		this.proteccionDrm = proteccionDrm;
	}

	/**
	 * Creamos un metodo que comprueba si un tipo de dispositivo (segun su nombre)
	 * es compatible segun su tipo de formato. En este caso si el nombre es tablet
	 * solo sera compatible si el formato es PDF Si es un kindle el formato tendra
	 * que ser EPUB sino saltara el mensaje de "Formato no compatible con el
	 * dispositivo."
	 * 
	 * @param nombre NombreProducto
	 * @return devuelve
	 */

	public String verificarCompatibilidad(String nombre) {
		if (formato.equalsIgnoreCase("PDF") && nombre.equalsIgnoreCase("Tablet")) {
			return "Compatible con el dispositivo.";
		} else if (formato.equalsIgnoreCase("EPUB") && nombre.equalsIgnoreCase("Kindle")) {
			return "Compatible con el dispositivo.";
		} else {
			return "Formato no compatible con el dispositivo";
		}
	}

	@Override
	public String toString() {
		return "LibroDigital [formato=" + formato + ", tamanoArchivo=" + tamanoArchivo + ", proteccionDrm="
				+ proteccionDrm + ", toString()=" + super.toString() + "]";
	}

}
