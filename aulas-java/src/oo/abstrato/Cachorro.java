package oo.abstrato;

public class Cachorro extends Mamifero{

	//É obrigatório a implementação dos métodos abstratos herdados
	@Override
	public String mover() {
		return "Usando as patas.";
	}
	@Override
	public String mamar() {
		return "Usando leite";
	}
}
