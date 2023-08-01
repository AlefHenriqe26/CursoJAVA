package exercicios.estruturas.controle;

import java.util.Scanner;

public class SomaPositivo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int n = 0;
		int total = 0;
		
		do {
			
			System.out.println("Digite um nº (Para sair digite um nº negativo): ");
			n=entrada.nextInt();
			if(n > 0) {
				total += n;	
			}
		} while (n > 0);
		
		System.out.println("O total de nº digitados é: " + total);
		entrada.close();
	}
}