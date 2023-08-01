package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarros{

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari(350);
		Civic civic = new Civic(120);
		
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.ligarAr();
		ferrari.acelerar();
		ferrari.desligarTurbo();
		ferrari.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
				
		System.out.println("\n---RETA---");
		System.out.println("FERRARI: " + ferrari.velocidadeAtual());
		System.out.println("CIVIC:   " + civic.velocidadeAtual());
		
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		civic.frear();

		System.out.println("\n---CURVA LEVE---");
		System.out.println("FERRARI: " + ferrari.velocidadeAtual());
		System.out.println("CIVIC:   " + civic.velocidadeAtual());
	}

}