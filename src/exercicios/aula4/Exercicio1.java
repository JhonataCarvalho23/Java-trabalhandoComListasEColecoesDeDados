package exercicios.aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Exercicio1 {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(14);
		numeros.add(27);
		numeros.add(11);
		
		Collections.sort(numeros);
		System.out.println(numeros);
	}

}
