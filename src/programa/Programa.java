package programa;

import java.util.Scanner;

import clases.Cliente;
import clases.GestorTiendaLibros;
import clases.Productos;
/**
 * Metodo main con el menu
 * Consta de 9 cases donde se iran dando de alta, buscando, listando y eliminando 
 * tanto Clientes como Productos
 * @author David
 *
 */
public class Programa {

	public static void main(String[] args) {
		GestorTiendaLibros gestor = new GestorTiendaLibros();

		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("-------------Menu de Opciones------------------");
			System.out.println("1 - Alta Cliente");
			System.out.println("2 - Alta Libro Fisico");
			System.out.println("3 - Alta Libro Digital");
			System.out.println("4 - Buscar Cliente");
			System.out.println("5 - Buscar Libro");
			System.out.println("6 - Listar Clientes");
			System.out.println("7 - Listar Libros");
			System.out.println("8 - Eliminar Cliente");
			System.out.println("9 - Eliminar Libro");
			System.out.println("10 - Salir");
			System.out.print("Elige una opcion: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:

				gestor.altaCliente("Carlos", "555C", "carlos@mail.com", 40);
				System.out.println("Cliente Carlos dado de alta");
				break;

			case 2:

				Cliente cliente1 = gestor.buscarCliente("555C");
				if (cliente1 == null) {
					System.out.println("Cliente no encontrado para asignar libro");
				} else {
					gestor.altaLibroFisico(101, "El Quijote", 30.0, cliente1, 500, "Tapa dura", 1.8);
					System.out.println("Libro fisico 'El Quijote' dado de alta.");
				}
				break;

			case 3:

				Cliente cliente2 = gestor.buscarCliente("555C");
				if (cliente2 == null) {
					System.out.println("Cliente no encontrado para asignar libro digital.");
				} else {
					gestor.altaLibroDigital(202, "Rebelion en la Granja", 15.0, cliente2, "PDF", "5MB", true);
					System.out.println("Libro digital 'Rebelion en la Granja' dado de alta.");
				}
				break;

			case 4:

				Cliente cliente = gestor.buscarCliente("555C");
				if (cliente != null) {
					System.out.println("Cliente encontrado: " + cliente);
				} else {
					System.out.println("Cliente no encontrado");
				}
				break;

			case 5:

				Productos productos = gestor.buscarLibro(101);
				if (productos != null) {
					System.out.println("Libro encontrado: " + productos);
				} else {
					System.out.println("Libro no encontrado");
				}
				break;

			case 6:

				System.out.println("Listado de clientes:");
				gestor.listarClientes();
				break;

			case 7:

				System.out.println("Listado de libros:");
				gestor.listarLibros();
				break;

			case 8:

				gestor.eliminarCliente("555C");
				System.out.println("Cliente con DNI 555C eliminado");
				break;

			case 9:

				gestor.eliminarLibro(101);
				System.out.println("Libro con codigo 101 eliminado");
				break;

			case 10:
				System.out.println("Saliendo del programa.");
				break;

			default:
				System.out.println("Opcion no contemplada");
			}

		} while (opcion != 10);

		sc.close();
	}
}
