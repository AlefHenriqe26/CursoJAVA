package oo.abstrato;

public class Cachorro extends Mamifero{

	//� obrigat�rio a implementa��o dos m�todos abstratos herdados
	@Override
	public String mover() {
		return "Usando as patas.";
	}
	@Override
	public String mamar() {
		return "Usando leite";
	}
}
