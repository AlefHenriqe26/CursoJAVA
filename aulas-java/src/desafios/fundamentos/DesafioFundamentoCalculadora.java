package desafios.fundamentos;

import java.util.Scanner;

public class DesafioFundamentoCalculadora {

	public static void main(String[] args) {
		//Ler num1 - Usu�rio digita
		//Ler num2 - Usu�rio digita
		//+ - * / % - Usu�rio digita

		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Por favor, digite um n�mero:");
		double a = teclado.nextDouble();

		System.out.println("Por favor, digite outro n�mero:");
		double b = teclado.nextDouble();
		
		System.out.println("Por favor, digite um operador aritm�tico:");
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
