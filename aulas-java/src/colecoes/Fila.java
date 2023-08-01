package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila
		//A diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana"); //Retorna falso.
		fila.offer("Bia"); //Lan�a uma exce��o.
		fila.offer("Carlos");
		fila.offer("Daneil");
		fila.offer("Rafaela");
		fila.offer("Gui");

		//Peek e Element -> obtem o pr�ximo elemento da fila (Sem remov�-lo)
		//A diferen�a � o comportamento quando a fila est� vazia!
		System.out.println(fila.peek()); //retorna Null
		System.out.println(fila.peek());
		System.out.println(fila.element()); //Lan�a uma exce��o.
		System.out.println(fila.element());
		
		//fila.size(); Saber o tamanho da fila
		//fila.clear(); Limpar fila
		//fila.isEmpty(); Saber se a fila est� ou n�o vazia.

		//Pool e remove ->obtem o pr�ximo elemento da fila (removendo-o)
		//Diferen�a do comportamento ocorre quando a fila est� vazia.
		System.out.println(fila.poll()); //retorna Null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		System.out.println(fila.remove());//Lan�a uma exce��o.
	}

}
