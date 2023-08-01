package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		//USUARIO INFORMAR� A QUANTIDADE DE NOTAS.
		//ARMAZENAR AS NOTAS EM UM ARRAY;
		//SOMAR TODAS AS NOTAS;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas: ");
		double[] notas = new double[entrada.nextInt()];
		
		for(int i = 0; i < notas.length; i++) {
			
			System.out.println("Digite a nota " + (i+1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total+= nota;
		}
		
		System.out.println("A media do aluno: " + total/notas.length);
	}

}
