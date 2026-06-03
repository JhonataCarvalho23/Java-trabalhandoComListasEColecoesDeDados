package exercicios.aula3;

import java.util.ArrayList;

public class Linguagens {

	
	// Exercicio 1
	
	
	public static void main(String[] args) {
		
		ArrayList<String> linguagens = new ArrayList<>();
		
		linguagens.add("Java");
		linguagens.add("Python");
		linguagens.add("JavaScript");
		linguagens.add("C++");
		
		for (String linguagem : linguagens){
			System.out.println(linguagem);
		}

	}

}
