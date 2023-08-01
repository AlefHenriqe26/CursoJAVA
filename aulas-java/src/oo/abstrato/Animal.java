package oo.abstrato;

public abstract class Animal {

	public String respirar() {
		return "CO2";
	}
	
	//SÓ É POSSÍVEL TER MÉTODO ABSTRATO EM CLASSE ABSTRATA
	public abstract String mover();
}
