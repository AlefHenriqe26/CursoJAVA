package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Alef");
		Cliente cliente2 = new Cliente("Rebecca");
		
		Compra compra1 = new Compra();
		compra1.setItens("Caneta", 9.67, 100);
		compra1.setItens(new Produto("Notebook", 1897.88), 2);
		
		Compra compra2 = new Compra();
		compra2.setItens("Caderno", 19.99, 10);
		compra2.setItens(new Produto("Impressora", 998.9), 1);
		
		cliente1.compras.add(compra1);
		cliente1.compras.add(compra2);
		
		System.out.println(compra1.getValorTotal());
		System.out.println(compra2.getValorTotal());
		System.out.println(cliente1.getValorTotal());
		
	}

}
