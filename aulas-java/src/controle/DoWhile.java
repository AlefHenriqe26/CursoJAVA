package controle;

import java.beans.DefaultPersistenceDelegate;
import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		do {
			System.out.println("Escreva as palavras mágicas...");
			System.out.println("Quer sair?");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Pode sair. =]");
		entrada.close();
	}
}

