package lambdas;

// FUN��ES LAMBDAS S�O FUN��ES AN�NIMAS QUE UTILIZAMOS DENTRO DO C�DIGO
// PARA DEFINIR QUE UMA INTERFACE RECEBA UMA FUN��O LAMBDA A INTERFACE PRECISA TER A NOMENCLATURA/ANNOTATION ABAIXO
@FunctionalInterface
// ESSA ANNONTATION/NOMENCLATURA VALIDA QUE VOC� S� UTILIZE UM M�TODO/FUN��O NESSA INTERFACE
public interface Calculo {
	public abstract double executar(double a, double b);
}