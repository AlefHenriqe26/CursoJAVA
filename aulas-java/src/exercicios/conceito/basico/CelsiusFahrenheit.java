package exercicios.conceito.basico;

import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantos Graus Celsius fazem:");
		
		double c = entrada.nextDouble();
		double f = c * 1.8 + 32;
		
		System.out.println("Graus Fahrenheit: " + f);
		entrada.close();
	}
}
