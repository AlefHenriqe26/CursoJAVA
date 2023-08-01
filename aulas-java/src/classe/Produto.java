package classe;

import java.util.Scanner;

public class Produto {

	// DESCONTO = PODE VARIAR

	Scanner entrada = new Scanner(System.in);
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(){
		
	}
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

//	static void prodDesconto(double d) {
//		desconto = d;
//	}
	
	double precoComDesconto() {
		return preco*(1-desconto);
	}
}
