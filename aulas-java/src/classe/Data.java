package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
//		dia = 01;
//		mes = 03;
//		ano = 1970;
		this(1,1,1970);
	}
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	// Objetos -> null; // Variáveis do tipo objeto se não inicializada ela receberá o valor Null;
	// String s - null; //Variáveis com valor nulo significa que a variável não aponta para nenhum local de memória.
	
	String obterDataFormatada() {	
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano); //Format cria a formatação de uma String utilizando variaveis
	}
}
