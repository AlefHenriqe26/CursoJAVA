package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);
		
		System.out.println("VIDA MONSTRO: " + monstro.vida);
		System.out.println("VIDA HEROI: " + heroi.vida);
				
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("VIDA MONSTRO: " + monstro.vida);
		System.out.println("VIDA HEROI: " + heroi.vida);
		
	}
}
