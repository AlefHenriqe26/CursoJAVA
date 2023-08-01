package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.println("Bom");
		System.out.println(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("\nSalário: %1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		int a = 3;
		Scanner entrada = new Scanner(System.in); //System.in = Entrada no Sistema
		System.out.println("Digite o nome de seu Pokemon: ");
		String nome = entrada.nextLine();
		
		System.out.println("\n" + nome + " é seu Pokemon! =D");
		
		System.out.println("\nHá quantos anos você o treina?");
		int idade = entrada.nextInt();
		
		System.out.println("\nVocê o treina há " + idade + " ano(s)");
		
		entrada.close();
	}
}
