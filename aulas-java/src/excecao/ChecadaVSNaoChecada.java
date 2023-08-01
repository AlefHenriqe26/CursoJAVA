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
	
	// Exceção NÃO checada ou NÃO verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	
	// Exceção checada ou verificada, o JAVA me obriga a colocar uma assinatura no método;
	// Eu posso tratar esse tipo de exceção no corpo do método ou no chamador;
	// Tratando no corpo eu não preciso colocar a assinatura "Throws Exception;
	// Colocando a assinatura eu sou obrigado a tratá-la sempre que chamo o método.
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02");
	}

}
