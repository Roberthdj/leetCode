package data_structures.colas;

public interface ColaProceso {

	void encolar(Trabajo t);

	void eliminar();

	Trabajo obtener();
	
	int longitud();
	
	boolean vacia();
	
}
