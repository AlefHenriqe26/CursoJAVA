package fundamentos;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		System.out.println(3 > 3);
		System.out.println(3 >= 3);
		System.out.println(3 < 3);
		System.out.println(3 <= 3);
		System.out.println(3 != 3);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim." : "não.";
		
		System.out.println("Tem desconto? " + resultado);
	}
}
