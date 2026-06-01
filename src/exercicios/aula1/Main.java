package exercicios.aula1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		
		Pessoa eu = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		eu.setName("Jhonata");
		pessoa2.setName("Maria");
		pessoa3.setName("Ricardo");
		
		eu.setAge(17);
		pessoa2.setAge(47);
		pessoa3.setAge(50);
		
		// Exercicio 2
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		// Exercicio 3
		pessoas.add(eu);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		// Exercicio 4
		System.out.println("Tamanho da lista: " + pessoas.size());
		// Exercicio 5
		System.out.println("Primeira pessoa da lista: " + pessoas.get(0));
		// Exercicio 6
		System.out.println("Lista completa: " + pessoas.toString());
	}
}
