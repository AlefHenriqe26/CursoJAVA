package exercicios.estruturas.controle;

import java.util.Scanner;

public class Par1a10 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um nº de 1 à 10: ");
		int n = entrada.nextInt();
		
		if(n >= 0 && n <= 10) {
			if(n % 2 == 0) {
				System.out.println(n + " está entre 0 e 10 e é um nº par");
				//break;
			} else {
				System.out.println(n + " está entre 0 e 10 e não é um nº par");
			}
			
		} else {
			if(n % 2 == 0) {
				System.out.println(n + " não está entre 0 e 10, mas é um nº par");
				//break;
			} else {
				System.out.println(n + " não está entre 0 e 10 e também não é um nº par");
			}
		}
		
		entrada.close();
		
	}
}
