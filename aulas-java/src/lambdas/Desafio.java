package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.text.DecimalFormat;

public class Desafio {
	public static void main(String[] args) {
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> desconto = prod -> (prod.preco * (1 - prod.desconto));
		System.out.println(desconto.apply(p));
		double precoComDesconto = (desconto.apply(p));
		
		UnaryOperator<Double> impostoMunicipal = (v) -> {
			double percentualIM = 8.5/100;
			double im;
			if(v >= 2500) {
				im = v * percentualIM;
				return im + v;
			} else {
				return v;
			}
		};
		System.out.println("Preço cheio: " + impostoMunicipal.apply(p.preco));
		System.out.println("Preço com Desconto: " + impostoMunicipal.apply(precoComDesconto));
		double precoComIM = (impostoMunicipal.apply(precoComDesconto));
		
		UnaryOperator<Double> valorComFrete = (v) -> {
			if(v >= 3000) {
				return v + 100;
			} else {
				return v + 50;
			}
		};
		System.out.println("Preço cheio: " + valorComFrete.apply(p.preco));
		System.out.println("Preço com Desconto e IM: " + valorComFrete.apply(precoComIM));
		double precoComFrete = (valorComFrete.apply(precoComIM));
		
		Function<Double, String> arredondar = (v) -> {
			String valorArredondado = (new DecimalFormat("R$#,##0.00").format(v)); 
			return valorArredondado;
		};
		System.out.println("Preço cheio: " + arredondar.apply(p.preco));
		System.out.println("Preço com Desconto e IM e FRETE: " + arredondar.apply(precoComFrete));
		
		String precoFinal = arredondar.apply(precoComFrete);
		System.out.println();
		/* 1. A partir do produto calcular o preço real (com desconto);
		 * 2. Imposto Municipal: >= 2500 (8.5%) / < 2500 (Isento);
		 * 3. Frete: >= 3000 (100) / < 3000 (50);
		 * 4. Arredondar: Deixar duas casa decimais;
		 * 5. Formatar: R$1234,56.
		 */
	}
}
