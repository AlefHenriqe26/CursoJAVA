package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra("Jo�o Pedro");
		c1.itens.add(new Item("Caneta", 20, 7.45));
		c1.itens.add(new Item("Borracha", 12, 3.89));
		c1.itens.add(new Item("Caderno", 3, 18.79));
		//c1.itens.add(new Item("Caneta", 20, 7.45));
		
		System.out.println(c1.itens.size());
		System.out.println("O total �: R$ " + c1.getValorTotal());
	}

}