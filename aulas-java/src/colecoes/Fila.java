package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila
		//A diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); //Retorna falso.
		fila.offer("Bia"); //Lança uma exceção.
		fila.offer("Carlos");
		fila.offer("Daneil");
		fila.offer("Rafaela");
		fila.offer("Gui");

		//Peek e Element -> obtem o próximo elemento da fila (Sem removê-lo)
		//A diferença é o comportamento quando a fila está vazia!
		System.out.println(fila.peek()); //retorna Null
		System.out.println(fila.peek());
		System.out.println(fila.element()); //Lança uma exceção.
		System.out.println(fila.element());
		
		//fila.size(); Saber o tamanho da fila
		//fila.clear(); Limpar fila
		//fila.isEmpty(); Saber se a fila está ou não vazia.

		//Pool e remove ->obtem o próximo elemento da fila (removendo-o)
		//Diferença do comportamento ocorre quando a fila está vazia.
		System.out.println(fila.poll()); //retorna Null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		System.out.println(fila.remove());//Lança uma exceção.
	}

}
