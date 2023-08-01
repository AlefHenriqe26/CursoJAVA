package controle;

public class Continue {
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue; //Quebra uma repetição e continua nas outras.
			}
			System.out.println(i);
		}
	System.out.println("Fim!");
	}
}
