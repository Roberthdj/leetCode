package data_structures.colas;

public class Ejecutar {

	public static void main(String[] args) {

		Trabajo t1 = new Trabajo("Trabajo uno", "Autor uno", false);
		Trabajo t2 = new Trabajo("Trabajo dos", "Autor dos", true);
		Trabajo t3 = new Trabajo("Trabajo tres", "Autor tres", false);

		ColaProceso nuevaCola = new ColaProcesoImpl();

		nuevaCola.encolar(t1);
		nuevaCola.encolar(t2);
		nuevaCola.encolar(t3);

		while (!nuevaCola.vacia()) {
			System.out.println(nuevaCola.obtener().getTitulo() + " : " + nuevaCola.obtener().getAutor() + " : "
					+ nuevaCola.obtener().isImpreso());
			nuevaCola.eliminar();
		}
	}
}
