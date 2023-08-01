package exercicios.estruturas.controle;

import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println(ano + " este ano é bissexto");
		} else {
			System.out.println(ano + " este ano não é bissexto");
		}
		entrada.close();
	}
}
