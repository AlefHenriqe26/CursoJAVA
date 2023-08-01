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

		System.out.println("Tamanho é: " + conjunto.size());
		
		conjunto.add("Teste"); //Não aceita repetição
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste")); //Remove um elemento quando não existe retorna false
		System.out.println("Tamanho é: " + conjunto.size()); //É possível verificar que foi removido aqui.
		System.out.println(conjunto.remove("Teste")); //Quando existe retorna verdadeiro e remove o elemento
		System.out.println("Tamanho é: " + conjunto.size()); //É possível verificar que foi removido aqui.
		
		System.out.println(conjunto.contains('x')); //Verifica se contém o elemnto dentro do conjunto, no caso retornará verdadeiro
	
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums); //Pode ser usado no lugar de vetor ou Array
		System.out.println(conjunto);
		
		conjunto.addAll(nums); //União entre dois conjuntos
		System.out.println(conjunto); 
		
		conjunto.retainAll(nums); //Deixo apenas no conjunto os valores que aparecem em nums
		System.out.println(conjunto);
		
		conjunto.clear(); //Limpa todos os valores contido no conjunto
		System.out.println(conjunto);
	
	}
}
