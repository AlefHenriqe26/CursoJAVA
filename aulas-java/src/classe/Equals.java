package classe;

public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pe.si@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Alef Henrique";
		u2.email = "al.he@ezemail.com.br";
		
		Usuario u3 = new Usuario();
		u3.nome = "Pedro Silva";
		u3.email = "pe.si@ezemail.com.br";
		
		System.out.println(u1 == u3);
		System.out.println(u1.equals(u3));
		System.out.println(u3.equals(u1));
	}

}
