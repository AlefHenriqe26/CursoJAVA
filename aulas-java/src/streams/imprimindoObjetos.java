package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObjetos {
	public static void main(String[] args) {
	
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana", "Becca");
		
		System.out.println("For Tradicional:");
		for(int i = 0; i < aprovados.size(); i++) {
			if(i == aprovados.size()-1){
				System.out.println(" - " + aprovados.get(i) + ".");
			} else {
				System.out.println(" - " + aprovados.get(i) + ";");
			}
		}
		
		System.out.println("\nForEach:");
		for(String nome: aprovados) {
			System.out.println(" - " + nome + ";");
		}
		
		System.out.println("\nIterator:");
		//Iterator faz uma varredura na lista enquanto tiver valor ele retornará verdadeiro.
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(" - " + it.next() + ".");
		}
		
		System.out.println("\nStream:");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println); //Laço Interno
	}
}