package fundamentos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y); //soma
		System.out.println(x - y); //subtração
		System.out.println(x * y); //multiplicação
		System.out.println(x / y); //divisao
		System.out.println(x % y); //operador modulo
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / (double)b);
		System.out.println(a % (float)b);
		
		System.out.println(a + b - x / y);
	}
}
