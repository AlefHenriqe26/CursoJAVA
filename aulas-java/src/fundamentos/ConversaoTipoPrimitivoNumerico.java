package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a); //Irá nos retornar 1.0, pq o Java faz a conversão implicita dos valores.
		
		//float b = 1.0F;
		float b = (float) 1.123456788; //Este tipo de conversão, é uma conversão explicita, estou explicitando, dando a certeza ao JAVA de que quero converter o valor para um float.
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //Mesmo com variáveis necessitamos explicitar.
		System.out.println(d + " " + c);		
	}

}