package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		
		//JAVA NÃO PERMITE CONVERTER UM VALOR INT NUMA CLASSE DOUBLE, POR ISSO, PRECISAMOS COLOCAR AS CASAS DECIMAIS NOS Nºs
		
		BinaryOperator<Double> teste = (x, y) -> { return x + y; };
		System.out.println(teste.apply(2.0 ,3.0));		
		
		teste = (x, y) -> x * y;
		System.out.println(teste.apply(2.0, 3.0));
	}
}
