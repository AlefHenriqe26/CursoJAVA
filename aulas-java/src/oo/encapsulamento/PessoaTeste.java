 package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Alef", 27);
		System.out.println(p1.getNome());	
		System.out.println(p1.lerIdade()); //acessamos ou lemos o valor variavel.		
		
		p1.alterarIdade(-31);; //alterar o valor da variavel
		System.out.println(p1.getNome());	
		System.out.println(p1.lerIdade()); //acessamos ou lemos o valor variavel.
			
		//Se for constante só podemos ler o valor
	}
}
