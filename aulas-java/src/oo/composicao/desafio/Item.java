package oo.composicao.desafio;

public class Item {
	// Uma lista de itens terá uma compra
	// Uma item item terá um Produto
	final int quantidade;
	final Produto produto;
	
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
