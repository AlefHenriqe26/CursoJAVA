package lambdas;
import java.util.function.Function;
public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar =
				n -> n % 2 == 0 ? "Par" : "�mpar";
				
		System.out.println(parOuImpar.apply(30));
		
		Function<String, String> oResultadoE =
				valor -> "O resultado �: " + valor;
			
		String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(32);
		System.out.println(resultadoFinal);
	}
}