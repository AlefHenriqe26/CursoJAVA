package desafios.fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	//Criar um Scanner, pegar 3 String, calcular media do funcionario, pode ser digitado o valor do salario com virgula ou ponto.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor1 = entrada.nextLine().replace(',', '.');
		String valor2 = entrada.nextLine().replace(',', '.');
		String valor3 = entrada.nextLine().replace(',', '.');
		
		double v1 = Double.parseDouble(valor1); 
		double v2 = Double.parseDouble(valor2);
		double v3 = Double.parseDouble(valor3);
		
		double total = v1+v2+v3;
		double media = total / 3;
		
		System.out.println("Total: " + total + "\nMedia: " + media);
		entrada.close();
	}
}
