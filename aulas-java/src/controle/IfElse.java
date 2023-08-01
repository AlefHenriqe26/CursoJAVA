package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número:"); //Chama um pop-up com uma mensagem.
		int num = Integer.parseInt(valor); //Transforma um String em uma valor inteiro.
	
		if(num % 2 == 0) {
			System.out.println("Número par!");
		} else {
			System.out.println("Número ímpar");
		}
	}
}