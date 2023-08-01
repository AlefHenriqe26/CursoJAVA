package desafios.controle;

import java.util.Scanner;

public class DesafioWhile {

	//NOTA VÁLIDA DE 0 A 10;
	//ARMAZENAR O VALOR DA NOTA E SOMA
	//QUANTAS NOTAS DIGITADAS
	//MEDIA DA NOTA
	//QUANDO DIGITAR UMA NOTA -1 SAI DO LAÇO
	//NOTAS INVÁLIDAS O PROGRAMA AINDA RODA 
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double total = 0;
		int cont = 0;
		do {
			if(nota >= 0 && nota <= 10) {
				total += nota;
				cont++;
			} else {
				System.out.println("Digita uma no válida, por favor, entre 1 à 10 ou -1 para encerrar.");
			}
		} while (nota != -1);
		
		double media = total/cont;
		
		System.out.println("Total: "+ total);
		System.out.println("Quantidade de notas: "+ cont);
		System.out.println("Media: " + media);
		
		entrada.close();
	}
}
