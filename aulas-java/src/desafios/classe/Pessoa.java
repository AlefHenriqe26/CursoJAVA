package desafios.classe;

public class Pessoa {
	//Nome da pessoa, peso da pessoa, metodo comer receber classe comida
	String pessoa;
	double peso;
	
	double comer(double peso) {
		return this.peso + peso;
	}
}