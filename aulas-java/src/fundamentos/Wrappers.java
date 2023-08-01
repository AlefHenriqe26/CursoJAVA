package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		//Scanner entrada = new Scanner(System.in);
		
		// byte
		
		Byte b = 100;
		Short s = 1000;
		 //Integer.parseInt(entrada.next()) CONVERSÃO DE UMA STRING EM UM VALOR INTEIRO
		Integer i = 10000;
		Long l = 10000L;
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
				
		Float f = 123.45F;
		Double d = 1234.5678;
		System.out.println(f);
		System.out.println(d);

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); //O toString permite converter o boolean para uma String, permitindo assim utilizar o método toUpperCase da classe String.
		
		Character c = '#'; // char
		System.out.println(c + "...");

		//entrada.close;
	}

}
