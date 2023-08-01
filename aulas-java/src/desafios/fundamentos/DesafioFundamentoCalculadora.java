package desafios.fundamentos;

import java.util.Scanner;

public class DesafioFundamentoCalculadora {

	public static void main(String[] args) {
		//Ler num1 - Usuário digita
		//Ler num2 - Usuário digita
		//+ - * / % - Usuário digita

		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Por favor, digite um número:");
		double a = teclado.nextDouble();

		System.out.println("Por favor, digite outro número:");
		double b = teclado.nextDouble();
		
		System.out.println("Por favor, digite um operador aritmético:");
		String c = teclado.next();
		//double result = a  
		
		double resultado = "+".equals(c) ? a + b : 0;
		resultado = "-".equals(c) ? a - b : resultado;
		resultado = "/".equals(c) ? a / b : resultado;
		resultado = "*".equals(c) ? a * b : resultado;
		resultado = "%".equals(c) ? a % b : resultado;
		
		System.out.println(a + c + b + " = " + resultado);
		
	}

}
