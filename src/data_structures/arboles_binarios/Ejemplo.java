package data_structures.arboles_binarios;

import java.util.Arrays;

public class Ejemplo {

	public static void main(String[] args) {

		Empleado e1 = new Empleado(20, "Empleado1", "Ventas", "A-252");
		Empleado e2 = new Empleado(44, "Empleado2", "Recursos Humanos", "B-198");
		Empleado e3 = new Empleado(18, "Empleado3", "Ventas", "A-241");
		Empleado e4 = new Empleado(33, "Empleado4", "Contabilidad", "B-96");
		Empleado e5 = new Empleado(64, "Empleado5", "Marketing", "A-69");
		Empleado e6 = new Empleado(55, "Empleado6", "Informatica", "B-161");

		BSTImpl bst = new BSTImpl();
		
		//Arrays.asList(e1,e2,e3,e4,e5,e6).forEach(bst::insertar);
		Arrays.asList(e1,e2,e3,e4,e5,e6).forEach(e -> bst.insertar(e));
		
		bst.eliminar(20);
		bst.inorden();
		
		/*System.out.println("¿Esta vacío? " + bst.esVacio() + " - ¿Es hoja? " + bst.esHoja());
		bst.insertar(e1);
		System.out.println("¿Esta vacío? " + bst.esVacio() + " - ¿Es hoja? " + bst.esHoja());
		bst.insertar(e2);
		System.out.println("¿Esta vacío? " + bst.esVacio() + " - ¿Es hoja? " + bst.esHoja());
		
		localizar(bst, 44);
		localizar(bst, 15);*/

	}

/*	private static void localizar(BSTImpl bst, int id) {
		if (bst.existe(id)) {
			System.out.println(bst.obtener(id));
		} else {
			System.out.println("No encuentro el empleado " + id);
		}
	}*/

}
