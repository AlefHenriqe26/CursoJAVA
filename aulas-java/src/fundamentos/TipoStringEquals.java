package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		String s = new String("2");
		System.out.println("2"==s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine(); //N�o tira os espa�os em brancos, j� a fun��o next os tira.
		
		System.out.println("2"==s2.trim()); //Fun��o trim tira os espa�os em branco
		System.out.println("2".equals(s2.trim()));
	}
}
