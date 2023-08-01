package exercicios.estruturas.controle;

import java.util.Scanner;

public class NumPrimo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�: ");
		int n = entrada.nextInt();
		int cont = 0;
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				cont++;
			}
		}
		
		if(cont == 0) {
			System.out.println(n + " � um n� primo");
		} else {
			System.out.println(n + " � um n� composto");
		}
		entrada.close();
	}
}
