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
	// Objetos -> null; // Vari�veis do tipo objeto se n�o inicializada ela receber� o valor Null;
	// String s - null; //Vari�veis com valor nulo significa que a vari�vel n�o aponta para nenhum local de mem�ria.
	
	String obterDataFormatada() {	
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano); //Format cria a formata��o de uma String utilizando variaveis
	}
}
