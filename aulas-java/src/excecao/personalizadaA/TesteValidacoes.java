package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Alef", 7);
			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (StringVaziaException | NumeroForaDoIntervaloException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :-]");
	}
}
