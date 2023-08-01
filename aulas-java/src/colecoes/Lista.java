package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
	
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Carlos");
		lista.add(u1);
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); //Acessar pelo índice.
		
		System.out.println(">>>>> " + lista.remove(1)); // Retorna um objeto.
		System.out.println(lista.remove(new Usuario("Manu"))); // Retorna um booleano.
		System.out.println(lista.remove(new Usuario("Manu"))); // Retorna um booleano.
		System.out.println(lista.remove(new Usuario("Manu"))); // Retorna um booleano.
		
		System.out.println("Tem? " + lista.contains(new Usuario("Manu")));
		
		System.out.println(lista.contains(u1));

		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
