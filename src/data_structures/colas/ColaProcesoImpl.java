package data_structures.colas;

public class ColaProcesoImpl implements ColaProceso {

	private class NodoProceso {

		public Trabajo trabajo;
		public NodoProceso siguiente;

		public NodoProceso(Trabajo trabajo) {
			this.trabajo = trabajo;
			this.siguiente = null;
		}
	}

	private NodoProceso cabeza, ultimo;
	private int longitud = 0;

	@Override
	public void encolar(Trabajo t) {

		NodoProceso nuevoNodo = new NodoProceso(t);

		if (cabeza == null) {
			cabeza = nuevoNodo;
		} else {
			ultimo.siguiente = nuevoNodo;
		}

		ultimo = nuevoNodo;
		longitud++;
	}

	@Override
	public void eliminar() {
		if (cabeza != null) {
			NodoProceso eliminar = cabeza;
			cabeza = cabeza.siguiente;
			eliminar.siguiente = null;
			longitud--;
			if (cabeza == null) {
				ultimo = null;
			}
		}
	}

	@Override
	public Trabajo obtener() {
		if (cabeza == null) {
			return null;
		} else {
			return cabeza.trabajo;
		}
	}

	@Override
	public int longitud() {
		return longitud;
	}

	@Override
	public boolean vacia() {
		return longitud == 0;
	}
}
