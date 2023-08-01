package desafios.fundamentos;

public class DesafioOperadoresLogicos {
	public static void main(String[] args) {
		//TRABALHO TERÇA (V ou F)
		//TRABALHO QUINTA (V ou F)
		//DOIS TRABALHOS DEREM CERTO COMPRAR TV 52 E SORVETE;
		//UM TRABALHO DER CERTO COMPRAR TV 32 E SORVETE;
		//TRABALHO NAO DEU CERTO, NÃO TOMA SORVETE E NEM COMPRA A TV;
		
		boolean trab1 = true;
		boolean trab2 = false;
		
		boolean tv52 = trab1 && trab2;
		boolean tv32 = trab1 ^ trab2;
		boolean casa = !trab1 && !trab2;
		
		System.out.println("Comprou TV 50?\n" + tv52);
		System.out.println("Comprou TV 32?\n" + tv32);
		System.out.println("Ficou em casa?\n" + casa);
	}
}
