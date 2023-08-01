package exercicios.estruturas.controle;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int maior = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite " + i + "º valor:");
			int n = entrada.nextInt();
			if(n >= maior) {
				maior = n;
			}
		}
		System.out.println("O maior valor foi: " + maior);
	}
}
