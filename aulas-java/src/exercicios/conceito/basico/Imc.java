package exercicios.conceito.basico;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua altura em metros:");
		double a = entrada.nextDouble();
		
		System.out.println("Digite seu peso em kg");
		double p = entrada.nextDouble();
				
		double imc = p/(a*a);
		
		System.out.println("Seu IMC é: " + imc);
		
		entrada.close();
		
	}
}