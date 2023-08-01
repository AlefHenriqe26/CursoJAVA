package excecao;

public class Aluno {
	public final String nome;
	public final Double nota;
	public final boolean comportamentoAluno;
	
	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}
	
	public Aluno(String nome, Double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.comportamentoAluno = bomComportamento;
	}
	
	public String toString() {
		return nome;
	}
}
