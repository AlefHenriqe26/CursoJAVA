package classe;

//import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		
//		try (Scanner entrada = new Scanner(System.in)) {
//			Produto.prodDesconto(entrada.nextDouble());
//		}

		Produto.desconto = 0.25;
		Produto p1 = new Produto("Notebook", 4356.89);
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("M�dia do carrinho: R$%.2f", mediaCarrinho);
	}
}

//