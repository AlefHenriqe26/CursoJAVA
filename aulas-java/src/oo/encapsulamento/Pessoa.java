package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		alterarIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	// Getter
	public int lerIdade() { //getIdade
		return idade;
	}
	
	// Setter
	public void alterarIdade(int novaIdade) { //setIdade
		novaIdade = Math.abs(novaIdade); //Converte valor negativo em valor positivo.
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;	
		} else {
			System.out.println("Idade inválida!");
		}

	}
}