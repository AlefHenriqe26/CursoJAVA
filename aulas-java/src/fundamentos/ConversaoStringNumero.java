package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {

		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n�mero: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segund n�mero: ");
		
		System.out.println(valor1 + valor2);
		// O parse de qualquer Wrapper serve para converter uma string em um n� primitivo
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma � " + soma);
		System.out.println("Media � " + soma / 2);
	}

}
