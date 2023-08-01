package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Lapis", 1.99, 0.12, 0);
		Produto p2 = new Produto("Notebook", 4891.99, 0.32, 0);
		Produto p3 = new Produto("Caderno", 29.99, 0.45, 0);
		Produto p4 = new Produto("Impressora", 1200, 0.4, 0);
		Produto p5 = new Produto("IPad", 3000, 0.29, 0);
		Produto p6 = new Produto("Relogio", 1900, 0.12, 0);
		Produto p7 = new Produto("Monitor", 800, 0.12, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		//Predicate<Produto> grandeDesconto = p -> p.desconto >= 0.30;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> produtoRelevante = p -> p.preco >= 500;
		Function<Produto, String> chamadaPromocional = p -> "Aproveite, " + p.nome + " por apenas R$ " + p.preco;
		
		produtos.stream().filter(freteGratis).filter(produtoRelevante).map(chamadaPromocional).forEach(System.out::println);;
	}
}