package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a); //Ir� nos retornar 1.0, pq o Java faz a convers�o implicita dos valores.
		
		//float b = 1.0F;
		float b = (float) 1.123456788; //Este tipo de convers�o, � uma convers�o explicita, estou explicitando, dando a certeza ao JAVA de que quero converter o valor para um float.
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //Mesmo com vari�veis necessitamos explicitar.
		System.out.println(d + " " + c);		
	}

}