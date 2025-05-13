package clases;

public class Cliente {
	
	/*
	 * Creamos los atributos que van a tener los clientes de nuestra tienda
	 */

	private String nombre;
	private String dni;
	private String email;
	private int edad;

	/*
	 * Creamos e inicializamos el constructor 
	 * Creamos los setters y getters
	 */
	public Cliente(String nombre, String dni, String email, int edad) {

		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.edad=edad;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Lo sobreescribimos con toString
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", email=" + email + ", edad=" + edad + "]";
	}

	

}
