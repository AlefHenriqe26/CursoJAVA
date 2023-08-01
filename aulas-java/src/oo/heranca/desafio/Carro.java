package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	protected int velocidade = 0;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}
		velocidade += getDelta();
	}
	
	public void frear() {
		if(velocidade < getDelta()) {
			velocidade = 0;	
		} else {
			velocidade -= getDelta();;
		}
	}
	
	public String velocidadeAtual() {
		return velocidade + "km.";
	}
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}
