package streams;

public class Aluno {
	final String nome;
	final Double nota;
	final boolean comportamentoAluno;
	
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
