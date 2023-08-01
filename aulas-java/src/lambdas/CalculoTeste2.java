package lambdas;

public class CalculoTeste2 {
	// *** FUNÇÃO LAMBDA \/ *** \\
	@SuppressWarnings("unused")
	private static void main(String[] args) {
		Calculo somar = (x, y) -> {
			return x + y;
		};
		System.out.println(somar.executar(2,3));
		
		Calculo multiplicar = (x, y) -> x * y;
		System.out.println(multiplicar.executar(2,3));
		
	}
}
