package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		//Tudo em Java � objeto, menos os 8 tipos primitivos.
		String s = "texto";
		System.out.println(s.toUpperCase());
		
		//Wrappers s�o a vers�o objeto dos tipos primitivos!
		int a = 123;
		System.out.println(a);
	}
}
