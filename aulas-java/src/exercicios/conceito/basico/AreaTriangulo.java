package exercicios.conceito.basico;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a altura de seu triângulo: ");
		int h = entrada.nextInt();
		
		System.out.println("Digite a base de seu triângulo: ");
		int b = entrada.nextInt();;
		
		int a = (b*h)/2;
		
		System.out.println("Sua área é: "+ a);
		
		entrada.close();
	}
}
