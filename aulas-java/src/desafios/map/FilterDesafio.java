package desafios.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio {
	public static void main(String[] args) {
		
		Dentista d1 = new Dentista("Rogerio", "SP", "Alef", "SP", null);
		Dentista d2 = new Dentista("Rogerio", "SP", "Rebecca", "SP", null);
		Dentista d3 = new Dentista("Rogerio", "SP", "Luciene", "SP", null);
		Dentista d4 = new Dentista("Rogerio", "SP", "Joao", "BH", null);
		
		d1.setAtendeCliente(d1.estadoCliente);
		d2.setAtendeCliente(d2.estadoCliente);
		d3.setAtendeCliente(d3.estadoCliente);
		d4.setAtendeCliente(d4.estadoCliente);
		
		System.out.println(d1.getAtendeCliente());
		System.out.println(d2.getAtendeCliente());
		System.out.println(d3.getAtendeCliente());
		System.out.println(d4.getAtendeCliente());
		
		List<Dentista> dentista = Arrays.asList(d1, d2, d3, d4);
		
		Predicate<Dentista> possivelAgendamento = a -> a.atendeCliente;
		Predicate<Dentista> impossivelAgendamento = possivelAgendamento.negate();
		Function<Dentista, String> clienteAgendado = a -> a.nomeCliente + " sua consulta foi agendada!";
		Function<Dentista, String> clienteNaoAgendado = a -> a.nomeCliente + " impossivel agendar sua consulta!";
		
		System.out.println("\n");
		dentista.stream().filter(possivelAgendamento).map(clienteAgendado).forEach(System.out::println);
		System.out.println("\n");
		dentista.stream().filter(impossivelAgendamento).map(clienteNaoAgendado).forEach(System.out::println);
	}
}
