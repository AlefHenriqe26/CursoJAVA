package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.println("Bom");
		System.out.println(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("\nSal�rio: %1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Jo�o");
		
		int a = 3;
		Scanner entrada = new Scanner(System.in); //System.in = Entrada no Sistema
		System.out.println("Digite o nome de seu Pokemon: ");
		String nome = entrada.nextLine();
		
		System.out.println("\n" + nome + " � seu Pokemon! =D");
		
		System.out.println("\nH� quantos anos voc� o treina?");
		int idade = entrada.nextInt();
		
		System.out.println("\nVoc� o treina h� " + idade + " ano(s)");
		
		entrada.close();
	}
}
