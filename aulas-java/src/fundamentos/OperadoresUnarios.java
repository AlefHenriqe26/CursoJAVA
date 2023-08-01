package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		//FORMA PÓS FIXADA
		a++; //a = a+1
		a--; //a = a-1
		

		//FORMA PRÉ FIXADA
		++a; //a = 1+a
		--a; //a = 1-a
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
