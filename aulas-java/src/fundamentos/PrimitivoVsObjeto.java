package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		//Tudo em Java é objeto, menos os 8 tipos primitivos.
		String s = "texto";
		System.out.println(s.toUpperCase());
		
		//Wrappers são a versão objeto dos tipos primitivos!
		int a = 123;
		System.out.println(a);
	}
}
