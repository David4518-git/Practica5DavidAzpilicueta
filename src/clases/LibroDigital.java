package clases;

public class LibroDigital extends Productos{
	
	private String formato;
	private String tamanoArchivo;
	private boolean proteccionDrm;

	public LibroDigital(int codigo, String nombre, double precio,String formato,
			            String tamanoArchivo,boolean proteccionDrm) {
		super(codigo, nombre, precio);
		this.formato=formato;
		this.tamanoArchivo=tamanoArchivo;
		this.proteccionDrm=proteccionDrm;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getTamanoArchivo() {
		return tamanoArchivo;
	}

	public void setTamanoArchivo(String tamanoArchivo) {
		this.tamanoArchivo = tamanoArchivo;
	}

	public boolean isProteccionDrm() {
		return proteccionDrm;
	}

	public void setProteccionDrm(boolean proteccionDrm) {
		this.proteccionDrm = proteccionDrm;
	}

	@Override
	public String toString() {
		return "LibroDigital [formato=" + formato + ", tamanoArchivo=" + tamanoArchivo + ", proteccionDrm="
				+ proteccionDrm + ", toString()=" + super.toString() + "]";
	}

	
}
