package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X"; //Tipos que n�o s�o primitivos podemos usar o "." para chamar as funcionalidades do Tipo
		s.toUpperCase();
		System.out.println(s);
		
		// S� � poss�vel utilizar o metodo quando declaramos que a variavel receber� um novo valor, baseado no metodos, observe abaixo:
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!");
		System.out.println(s);
		
		//Mesmo n�o tendo declarado uma vari�vel � poss�vel utilizar seus metodos na hora que pe�o para mostrar no sistema
		System.out.println("Alef".toUpperCase()); 
		String y = "Bom dia X".replace("X", "Alef").toUpperCase().concat("!");
		System.out.println(y);
		
		//Tipos primitivos n�o o operador "."
		int a = 3;
		System.out.println(a);
		//Os objetos tem acesso aos atributos e comportamento e � o "." que nos deixa acessar os atributos e comportamento de um determinado objeto.
	}
}
