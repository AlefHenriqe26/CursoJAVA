package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4; //Variavel: estou alocando um espa�o da mem�ria dando um nome a ele e armazenando um valor nele.
		final double pi = 3.14159; //Constante: n�o permite que alteramos o valor de uma vari�vel.
		
		double area = pi * raio * raio;
		System.out.println("Area = " + area + "m�.");//Concatenar valores.
	}
}
