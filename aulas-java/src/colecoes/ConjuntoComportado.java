package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
	
		//Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<>(); //SortedSet � um conjunto Set que tem algum crit�rio de ordena��o, neste caso
		//o TreeSet ordena pela ordem de inser��o.
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro");
		
		for(String nome: lista) {
			System.out.println(nome); //N�o tem ordena��o, para vir ordenado na forma de inser��o, temos que utilizar o TreeSet
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for(int num: nums) { //Aqui ele converte um objeto para um tipo primitivo
			System.out.println(num); 
		}
	}
}
