package data_structures.lista_enlazada;

public class Ejecutar {

	public static void main(String[] args) {

		String datos = "";

		Libro libro1 = new Libro("La Maria", "Jorge", "3a2s1d");
		Libro libro2 = new Libro("100 años de soledad", "Gabo", "1a2b3c");
		Libro libro3 = new Libro("El poema del mio cid", "Anonimo", "abs123");

		Lista lista = new Lista();

		lista.insertarPrincipio(libro1);
		lista.insertarPrincipio(libro2);
		lista.insertarPrincipio(libro3);

		int longitud = lista.contar();

		for (int i = 0; i < longitud; i++) {

			datos = lista.obtener(i).getTitulo() + " : " + lista.obtener(i).getAutor() + " : "
					+ lista.obtener(i).getIsbn();

			System.out.println(datos);
		}

	}

}
