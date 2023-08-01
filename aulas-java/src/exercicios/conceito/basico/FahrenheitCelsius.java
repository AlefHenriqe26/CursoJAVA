package exercicios.conceito.basico;

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantos Graus Fahrenheit faz:");
		double f = entrada.nextDouble();
		double c = (f-32)/1.8;
		
		System.out.println("Graus Celsius: " + c);
		entrada.close();
	}
}
