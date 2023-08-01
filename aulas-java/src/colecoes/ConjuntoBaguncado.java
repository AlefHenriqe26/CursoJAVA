package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// CONJUNTO DE DADOS HETEROGENEO
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // Eles convertem automaticamente tipo primitivo em objeto;
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("Tamanho �: " + conjunto.size());
		
		conjunto.add("Teste"); //N�o aceita repeti��o
		System.out.println("Tamanho �: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste")); //Remove um elemento quando n�o existe retorna false
		System.out.println("Tamanho �: " + conjunto.size()); //� poss�vel verificar que foi removido aqui.
		System.out.println(conjunto.remove("Teste")); //Quando existe retorna verdadeiro e remove o elemento
		System.out.println("Tamanho �: " + conjunto.size()); //� poss�vel verificar que foi removido aqui.
		
		System.out.println(conjunto.contains('x')); //Verifica se cont�m o elemnto dentro do conjunto, no caso retornar� verdadeiro
	
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums); //Pode ser usado no lugar de vetor ou Array
		System.out.println(conjunto);
		
		conjunto.addAll(nums); //Uni�o entre dois conjuntos
		System.out.println(conjunto); 
		
		conjunto.retainAll(nums); //Deixo apenas no conjunto os valores que aparecem em nums
		System.out.println(conjunto);
		
		conjunto.clear(); //Limpa todos os valores contido no conjunto
		System.out.println(conjunto);
	
	}
}
