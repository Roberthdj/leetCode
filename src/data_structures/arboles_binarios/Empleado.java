package data_structures.arboles_binarios;

public class Empleado implements Comparable<Empleado> {

	private int id;
	private String nombre;
	private String puesto;
	private String despacho;

	public Empleado(int id, String nombre, String puesto, String despacho) {
		this.id = id;
		this.nombre = nombre;
		this.puesto = puesto;
		this.despacho = despacho;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	@Override
	public String toString() {
		String cadena = "Id: " + this.id + ", Nombre: " + this.nombre + ", Puesto: " + this.puesto + ", Despacho: "
				+ this.despacho;
		return cadena.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int compareTo(Empleado empl) {
		if (id == empl.id) {
			return 0;
		} else if (id < empl.id) {
			return -1;
		} else {
			return 1;
		}
	}

}
