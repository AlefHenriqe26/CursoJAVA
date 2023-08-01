package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livro = new ArrayDeque<String>();
		
		livro.add("O Pequeno Príncipe");
		livro.push("Don Quixote");
		livro.push("O Hobitt");
		
		System.out.println(livro.peek());
		System.out.println(livro.element());
		
		//ÚLTIMO A ENTRAR SERÁ O PRIMEIRO A SAIR.
		for(String livros: livro) {
			System.out.println(livros);
		}
		
		System.out.println(livro.poll());
		System.out.println(livro.remove());
		System.out.println(livro.element());
		System.out.println(livro.pop());
		
		
	}
}
