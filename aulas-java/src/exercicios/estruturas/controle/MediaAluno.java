package exercicios.estruturas.controle;

import java.util.Scanner;

public class MediaAluno {
	
	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Digita a nota1: ");
		double n1 = entrada.nextDouble();
		System.out.println("Digita a nota2: ");
		double n2 = entrada.nextDouble();
		
		double m = (n1 + n2)/2;
		
		if (m >= 7) {
			System.out.println("APROVADO");
		} else if (m < 7 && m >= 4){
			System.out.println("RECUPERAÇÃO");
		} else {
			System.out.println("REPROVADO");
		}
		
		entrada.close();
	}
}
