package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		//Método put não só adiciona mas tmb altera o valor de uma chave que já exista.
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Ricardo");
		usuarios.put(1, "Ricardo");
		usuarios.put(20, "Roberto");
		
		System.out.println(usuarios.size());
		
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Rebecca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty()); //Vai dizer se está vazio ou não o objeto.
		
		System.out.println(usuarios.keySet()); //Conjunto das chaves de usuários
		System.out.println(usuarios.values()); //Passará apenas os valores
		System.out.println(usuarios.entrySet()); //Retornará chave e valor
		
		System.out.println(usuarios.containsKey(20)); //Retornará verdadeiro se a chave conter dentro do map
		System.out.println(usuarios.containsValue("Rebecca")); //Retornará verdadeiro se o valor conter dentro do map
		
		System.out.println(usuarios.get(4)); //Retornará o valor em cima da chave que passarmos.
		System.out.println(usuarios.remove(1)); //Retornará verdadeiro de existir
		System.out.println(usuarios.remove(4, "Gui")); //Retornará falso se não existir
		
		//PERCORRENDO A CHAVE
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//PERCORRENDO OS VALORES
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//PERCORRENDO CHAVE E SEUS VALORES UTILIZANDO O Entry da biblioteca java.util.Mao
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " -> ");
			System.out.println(registro.getValue());
		}
		
		
	}
}
