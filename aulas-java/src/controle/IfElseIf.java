package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a media:");
		double media = entrada.nextDouble();
		boolean criterioAprovacao = media >= 7 && media < 10;
		boolean criterioRecuperacao = media >= 4.5 && media < 7;
		boolean mediaInvalida = media > 10 && media < 0;
		
		
		if(mediaInvalida) {
			System.out.println("Media digitada é inválida");
		} else {
			if(criterioAprovacao) {
				System.out.println("Aprovado");
				System.out.println("Parabéns! =D");
			}
			else if (criterioRecuperacao){
				System.out.println("Ficou de recupeção");
				System.out.println("Estude um pouco mais! ;)");
			} else {
				System.out.println("Reprovou");
				System.out.println("No vemos ano que vem! :]");
			}
		}
		entrada.close();
	}
}