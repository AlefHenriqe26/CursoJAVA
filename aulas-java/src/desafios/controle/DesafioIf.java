package desafios.controle;

public class DesafioIf {
	
	public static void main(String[] args) {
	
		double nota = 1.3;
		
		// Por causa do ponto e vírgula, a estrura de controle é encerrada antes das mensagens, por isso, 
		//as mensagens aparecem mesmo o aluno ter tirado uma nota inferior a 9.0.
		if(nota >= 9.0); {
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!!!");
		}
	}
}
