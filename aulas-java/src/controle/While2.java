package controle;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva a palavra chave: ");
		String texto = entrada.next();
		
		while(!texto.equalsIgnoreCase("Sair")) {
		
			System.out.println("Tente novamente:");
			texto = entrada.next();
		}
		
		System.out.println("Saiu!");
		entrada.close();
	}
}
