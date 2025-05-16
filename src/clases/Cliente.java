package clases;

/**
 * Creamos los atributos que van a tener los clientes de nuestra tienda Creamos
 * e inicializamos el constructor con todos los atributos Creamos los setters y
 * getters Sobreescribimos con toString()
 */

public class Cliente {

	private String nombre;
	private String dni;
	private String email;
	private int edad;
/**
 * Creamos constructor
 * @param nombre NombreCliente
 * @param dni DniCliente
 * @param email EmailCliente
 * @param edad EdadCliente
 */
	public Cliente(String nombre, String dni, String email, int edad) {

		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.edad = edad;

	}
/**
 * Devuelve nombre
 * @return nombre NombreCliente
 */
	public String getNombre() {
		return nombre;
	}
/**
 * Establece nombreCliente
 * @param nombre NombreCliente
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Devuelve dniCliente
 * @return dni dniCliente
 */
	public String getDni() {
		return dni;
	}
/**
 * Establece dniCliente
 * @param dni dniCliente
 */
	public void setDni(String dni) {
		this.dni = dni;
	}
/**
 * Devuelve emailCliente
 * @return email emailCliente
 */
	public String getEmail() {
		return email;
	}
/**
 * Establece emailCliente 
 * @param email emailCliente
 */
	public void setEmail(String email) {
		this.email = email;
	}
/**
 * Devuelve edadCliente
 * @return edad edadCliente
 */
	public int getEdad() {
		return edad;
	}
/**
 * Establece edadCliente
 * @param edad edadCliente
 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", email=" + email + ", edad=" + edad + "]";
	}

}
