package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	// Uma lista de compra terá 1 cliente
	// Uma Compra terá diversos itens.
	
	final List<Item> itens = new ArrayList<Item>();
	
	void setItens(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade)); 
	}
	
	void setItens(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade)); 
	}
	
	double getValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
