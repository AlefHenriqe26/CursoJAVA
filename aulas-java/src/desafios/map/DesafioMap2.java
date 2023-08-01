package desafios.map;

public interface DesafioMap2 {
	
	public static String conversaoBinario(Integer n) {
		//String b = Integer.toBinaryString(n);
		return Integer.toBinaryString(n); //Este metodo já existe na classe map não preciso reecria-lo posso usá-lo direto
	}
	
	public static String inversaoBinario(String n) {
		return new StringBuilder(n).reverse().toString();
	}
	
	public static Integer conversaoInteiro(String n) {
		return Integer.parseInt(n, 2);
	}
}