package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	//1 cliente terá uma lista de compras
	
	//Metodo que retornará quanto o cliente gastou na loja
	final String nome;
	final List<Compra> compras = new ArrayList<Compra>();

	public Cliente(String nome) {
		this.nome = nome;
	}
	
	double getValorTotal() {
		int total = 0;
		for(Compra compra: compras) {
			total += compra.getValorTotal();
		}
		return total;
	}
}
