package lambdas;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Consumidor {
	public static void main(String[] Args) {
	
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!");
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Notebook", 2987.34, 0.09);
		Produto p3 = new Produto("Caderno", 19.34, 0.09);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}