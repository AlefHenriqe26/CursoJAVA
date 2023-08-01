package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X"; //Tipos que não são primitivos podemos usar o "." para chamar as funcionalidades do Tipo
		s.toUpperCase();
		System.out.println(s);
		
		// Só é possível utilizar o metodo quando declaramos que a variavel receberá um novo valor, baseado no metodos, observe abaixo:
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!");
		System.out.println(s);
		
		//Mesmo não tendo declarado uma variável é possível utilizar seus metodos na hora que peço para mostrar no sistema
		System.out.println("Alef".toUpperCase()); 
		String y = "Bom dia X".replace("X", "Alef").toUpperCase().concat("!");
		System.out.println(y);
		
		//Tipos primitivos não o operador "."
		int a = 3;
		System.out.println(a);
		//Os objetos tem acesso aos atributos e comportamento e é o "." que nos deixa acessar os atributos e comportamento de um determinado objeto.
	}
}
