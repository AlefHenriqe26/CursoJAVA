package exercicios.estruturas.controle;

import java.util.Scanner;

public class Par1a10 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n� de 1 � 10: ");
		int n = entrada.nextInt();
		
		if(n >= 0 && n <= 10) {
			if(n % 2 == 0) {
				System.out.println(n + " est� entre 0 e 10 e � um n� par");
				//break;
			} else {
				System.out.println(n + " est� entre 0 e 10 e n�o � um n� par");
			}
			
		} else {
			if(n % 2 == 0) {
				System.out.println(n + " n�o est� entre 0 e 10, mas � um n� par");
				//break;
			} else {
				System.out.println(n + " n�o est� entre 0 e 10 e tamb�m n�o � um n� par");
			}
		}
		
		entrada.close();
		
	}
}
