package oo.composicao.desafio;

public class Item {
	// Uma lista de itens ter� uma compra
	// Uma item item ter� um Produto
	final int quantidade;
	final Produto produto;
	
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
