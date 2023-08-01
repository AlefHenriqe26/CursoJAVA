package desafios.controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		//Domingo = 1
		String dia = JOptionPane.showInputDialog("Informe o dia da semana:"); //Chama um pop-up com uma mensagem.	int num;
		int num;
		if("domingo".equalsIgnoreCase(dia)) { // A função Ignore case, não fará distinção de maiúscula ou minúscula
			//dia = "1";
			//num = Integer.parseInt(dia);
			num = 1;
		} else if ("segunda".equalsIgnoreCase(dia)) {
			//dia = "2";
			//int num = Integer.parseInt(dia);
			num = 2;
		} else if ("terça".equalsIgnoreCase(dia)) {
			//dia = "3";
			////int num = Integer.parseInt(dia);
			num = 3;
		} else if ("quarta".equalsIgnoreCase(dia)) {
			//dia = "4";
			//int num = Integer.parseInt(dia);
			num = 4;
		} else if ("quinta".equalsIgnoreCase(dia)) {
			//dia = "5";
			//int num = Integer.parseInt(dia);
			num = 5;
		} else if ("sexta".equalsIgnoreCase(dia)) {
			//dia = "6";
			//int num = Integer.parseInt(dia);
			num = 6;
		} else if ("sábado".equalsIgnoreCase(dia)) {
			//dia = "7";
			//int num = Integer.parseInt(dia);
			num = 7;
		} else {
			System.out.println("Dia inválido");
			dia = "Inválido";
			num = 0;
		}
		
		System.out.println("Dia digitado: " + dia + "\nseu numero é: " + num);
	}
}