package exercicios.conceito.basico;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um nº: ");
		int v = entrada.nextInt();
		
		double q = Math.pow(v, 2);
		double c = Math.pow(v, 3);
		
		System.out.println("Valor ao quadrado: " + q);
		System.out.println("Valor ao cubo: " + c);
		entrada.close();
	}
}