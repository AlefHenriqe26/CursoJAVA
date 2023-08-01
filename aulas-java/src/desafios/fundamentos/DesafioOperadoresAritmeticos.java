package desafios.fundamentos;

public class DesafioOperadoresAritmeticos {
	public static void main(String[] args) {
	
		var a = Math.pow(6 * (3+2), 2)/(3*2);
		var b = Math.pow(((1-5)*(2-7))/2, 2);
		
		System.out.println(a + " " + b);
		
		var c = Math.pow(a-b, 3)/Math.pow(10, 3);
		
		System.out.println("resultado: " + c);
	}
}
