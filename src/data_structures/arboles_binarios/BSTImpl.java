package data_structures.arboles_binarios;

public class BSTImpl implements BST<Empleado> {

	private Empleado valor;
	private BSTImpl izdo, dcho;
	private BSTImpl padre;

	@Override
	public boolean esHoja() {
		return valor != null && izdo == null && dcho == null;
	}

	@Override
	public boolean esVacio() {
		return valor == null;
	}

//----------------------------INSERTAR-----------------------------
	public void insertarImpl(Empleado empl, BSTImpl padre) {
		if (valor == null) {
			this.valor = empl;
			this.padre = padre;
		} else {
			if (empl.compareTo(valor) < 0) {
				if (izdo == null)
					izdo = new BSTImpl();
				izdo.insertarImpl(empl, this);
			} else if (empl.compareTo(valor) > 0) {
				if (dcho == null)
					dcho = new BSTImpl();
				dcho.insertarImpl(empl, this);
			} else {
				System.out.println("Esta intentando ingresar un elemento existente!");
			}
		}
	}

	@Override
	public void insertar(Empleado empl) {
		insertarImpl(empl, null);
	}

//----------------------------FIN-INSERTAR-------------------------
	
	@Override
	public boolean existe(int id) {
		if (valor != null) {
			if (id == valor.getId()) {
				return true;
			} else if (id < valor.getId() && izdo != null) {
				return izdo.existe(id);
			} else if (id > valor.getId() && dcho != null) {
				return dcho.existe(id);
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public Empleado obtener(int id) {
		if (valor != null) {
			if (id == valor.getId()) {
				return valor;
			} else if (id < valor.getId() && izdo != null) {
				return izdo.obtener(id);
			} else if (id > valor.getId() && dcho != null) {
				return dcho.obtener(id);
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	@Override
	public void preorden() {
		if (valor != null) {
			System.out.println(valor);
			if (izdo != null)
				izdo.preorden();
			if (dcho != null)
				dcho.preorden();
		}
	}

	@Override
	public void inorden() {
		if (valor != null) {
			if (izdo != null)
				izdo.inorden();
			System.out.println(valor);
			if (dcho != null)
				dcho.inorden();
		}
	}

	@Override
	public void postorden() {
		if (valor != null) {
			if (izdo != null)
				izdo.postorden();
			if (dcho != null)
				dcho.postorden();
			System.out.println(valor);
		}
	}
	
//----------------------------ELIMINAR-----------------------------
	private BSTImpl minimo() {
		if(izdo != null && ! izdo.esVacio()) {
			return izdo.minimo();
		}else {
			return this;
		}
	}

	private void eliminarImpl(int id) {
		if (izdo != null && dcho != null) {
			
			BSTImpl minimo = dcho.minimo();
			this.valor = minimo.valor;
			dcho.eliminar(minimo.valor.getId());

		} else if (izdo != null || dcho != null) {

			BSTImpl sustituto = izdo != null ? izdo : dcho;
			this.valor = sustituto.valor;
			this.izdo = sustituto.izdo;
			this.dcho = sustituto.dcho;

		} else {

			if (padre != null) {
				if (this == padre.izdo)
					padre.izdo = null;
				if (this == padre.dcho)
					padre.dcho = null;
				padre = null;
			}
			valor = null;
		}

	}

	@Override
	public void eliminar(int id) {
		if (valor != null) {
			if (id == valor.getId()) {
				eliminarImpl(id);
			} else if (id < valor.getId() && izdo != null) {
				izdo.eliminar(id);
			} else if (id > valor.getId() && dcho != null) {
				dcho.eliminar(id);
			}
		}

	}

}
