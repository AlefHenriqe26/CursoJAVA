package desafios.map;

public class Dentista {
	final String nomeDentista;
	final String estadoDentista;
	final String nomeCliente;
	final String estadoCliente;
	Boolean atendeCliente;
	
	
	public Dentista(String nomeDentista, String estadoDentista, String nomeCliente, String estadoCliente, Boolean atendeCliente) {
		super();
		this.nomeDentista = nomeDentista;
		this.estadoDentista = estadoDentista;
		this.nomeCliente = nomeCliente;
		this.estadoCliente = estadoCliente;
		this.atendeCliente = null;
	}

	public void setAtendeCliente(String estado) {
		 if(estado == this.estadoDentista) {
			 this.atendeCliente = true;
		 } else {
			 this.atendeCliente = false;
		 }
	 }
	
	Boolean getAtendeCliente() {
		return atendeCliente;
	}
}