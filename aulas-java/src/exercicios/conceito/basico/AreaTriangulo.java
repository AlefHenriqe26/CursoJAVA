package exercicios.conceito.basico;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a altura de seu tri�ngulo: ");
		int h = entrada.nextInt();
		
		System.out.println("Digite a base de seu tri�ngulo: ");
		int b = entrada.nextInt();;
		
		int a = (b*h)/2;
		
		System.out.println("Sua �rea �: "+ a);
		
		entrada.close();
	}
}
