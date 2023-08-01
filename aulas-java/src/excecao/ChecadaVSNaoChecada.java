package excecao;

public class ChecadaVSNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :-]");
	}
	
	// Exce��o N�O checada ou N�O verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	
	// Exce��o checada ou verificada, o JAVA me obriga a colocar uma assinatura no m�todo;
	// Eu posso tratar esse tipo de exce��o no corpo do m�todo ou no chamador;
	// Tratando no corpo eu n�o preciso colocar a assinatura "Throws Exception;
	// Colocando a assinatura eu sou obrigado a trat�-la sempre que chamo o m�todo.
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02");
	}

}
