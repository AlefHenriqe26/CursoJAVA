package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informa��es do funcion�rios
		
		//Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos num�ricos reais
		float salario = 11445.44F;
		double vendaAcumuladas = 2991797103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // true
		
		//Tipo caractere
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendaAcumuladas);
		
		System.out.println("id: "+ id + "ganha " + salario);
		
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: "+ status);
	}
}
