package desafios.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {
	public static void main(String[] args) {
		
		//Consumer<String> printS = System.out::print;
		Consumer<Integer> printI = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		
//		1. Número para string binária... 6 -> "110"
//		2. Reverter a String... "110" -> "011"
//		3. Converter de para inteiro... "011" -> 3
//		
		nums.stream().map(Integer::toBinaryString)
			.map(DesafioMap2::inversaoBinario).map(DesafioMap2::conversaoInteiro).forEach(printI);;
	}
}