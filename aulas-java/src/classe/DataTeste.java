package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data nasc = new Data(26,03,1995);
		Data hoje = new Data(26,03,1995);
		Data padrao = new Data() ;
//		nasc.dia = 26;
//		nasc.mes = 3;
//		nasc.ano = 1995;
//		
//		hoje.dia = 26;
//		hoje.mes = 3;
//		hoje.ano = 2022;

		System.out.println("Nascimento: " + nasc.obterDataFormatada());
		System.out.println("Hoje: " + hoje.obterDataFormatada());
		System.out.println("Default: " + padrao.obterDataFormatada());
		
		if(nasc.dia == hoje.dia && nasc.mes == hoje.mes) {
			System.out.println("Feliz aniversário!!!");
		//	System.out.println("Você ganhou um desconto aniversário de 50% em um dos produtos.");
		}
		
		
	}
}
