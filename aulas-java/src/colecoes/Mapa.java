package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		//M�todo put n�o s� adiciona mas tmb altera o valor de uma chave que j� exista.
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Ricardo");
		usuarios.put(1, "Ricardo");
		usuarios.put(20, "Roberto");
		
		System.out.println(usuarios.size());
		
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Rebecca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty()); //Vai dizer se est� vazio ou n�o o objeto.
		
		System.out.println(usuarios.keySet()); //Conjunto das chaves de usu�rios
		System.out.println(usuarios.values()); //Passar� apenas os valores
		System.out.println(usuarios.entrySet()); //Retornar� chave e valor
		
		System.out.println(usuarios.containsKey(20)); //Retornar� verdadeiro se a chave conter dentro do map
		System.out.println(usuarios.containsValue("Rebecca")); //Retornar� verdadeiro se o valor conter dentro do map
		
		System.out.println(usuarios.get(4)); //Retornar� o valor em cima da chave que passarmos.
		System.out.println(usuarios.remove(1)); //Retornar� verdadeiro de existir
		System.out.println(usuarios.remove(4, "Gui")); //Retornar� falso se n�o existir
		
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
