package exercicios.estruturas.controle;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumRandom {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		
		int n = random.nextInt(100);
		System.out.println("Chute um nº de 0 à 100: ");
		for(int i = 1; i <= 10; i++) {
			int chute = entrada.nextInt();
			if(chute == n) {
				System.out.println("Tentativa " + i +": Acertou!");
				i = 11;
			} else {
				System.out.println("Tentativa " + i +": Errou!");
				System.out.println("Tente de novo: ");
			}
		}
		entrada.close();
	}
}
