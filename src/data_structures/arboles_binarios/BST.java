package data_structures.arboles_binarios;

public interface BST<T extends Comparable> {

	void insertar(T empl);

	boolean existe(int id);

	T obtener(int id);

	boolean esHoja();

	boolean esVacio();

	void preorden();

	void inorden();

	void postorden();

	void eliminar(int id);

}
