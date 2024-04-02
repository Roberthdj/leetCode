package data_structures.pilas;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {

		Stack<Integer> pila = new Stack<Integer>();

		System.out.println("Lista vacía: " + pila);
		System.out.println("Esta vacía? " + pila.isEmpty());

		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);

		for (Integer pilita : pila) {
			System.out.println(pilita);
		}

		System.out.println("Stack: " + pila);
		System.out.println("Esta vacía? " + pila.isEmpty());
		
		pila.pop(); // Elimina el último elemento que entró
		System.out.println("Esta el 3? " + pila.search(3));
		System.out.println("Ultimo agregado: " + pila.peek());

	}
}
