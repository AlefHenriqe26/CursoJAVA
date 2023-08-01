package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.14; //MEMBRO PODE SER UM ATRIBUTO EST�TICO 
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) { //MEMBRO PODE SER UM M�TODO EST�TICO
		return PI * Math.pow(raio, 2);
	}
}
