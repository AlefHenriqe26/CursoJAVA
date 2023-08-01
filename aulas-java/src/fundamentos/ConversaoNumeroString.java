package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {

		Integer num1 = 10000;
		//Convertendo um nº numa String a gente tem acesso ao Métodos da String como por exemplo o método length
		System.out.println(num1.toString().length());

		int num2 = 10000;
		System.out.println(Integer.toString(num2)); 
		
		System.out.println((""+num2).length());
		
		//EM RESUMO, O JEITO MAIS COMUM DE CONVERTER UM DADO PRIMITIVO PARA STRING É UTILIZANDO toString. 
	}

}
