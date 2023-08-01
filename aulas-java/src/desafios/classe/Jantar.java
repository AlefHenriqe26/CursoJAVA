package desafios.classe;

import java.util.Scanner;

public class Jantar {

	public static void main(String[] args) {
		// Criar um pessoa, instanciar uma pessoa, instanciar duas comidas, fazer com que a pessoa coma a comida.
		
		Scanner entrada = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		Comida c1 = new Comida();
		
		System.out.println("Digite seu nome: ");
		p1.pessoa = entrada.nextLine();
		System.out.println("Digite seu peso: ");
		p1.peso = entrada.nextDouble();
		
		for(int i=1; i<=2; i++) {
			
			System.out.println("Prato " + i);
			System.out.println("Digite seu prato: ");
			c1.comida = entrada.next();
			System.out.println("Digite seu peso: ");
			c1.peso = entrada.nextDouble();
			p1.peso = p1.comer(c1.peso);
		}
		
		System.out.println("Seu novo peso é: " + p1.peso);
		entrada.close();
	}

}
