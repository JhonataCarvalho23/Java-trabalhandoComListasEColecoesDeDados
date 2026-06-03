package exercicios.aula3;

import java.util.ArrayList;

public class MainFormas {

	public static void main(String[] args) {
		// Exercicio 5
		
		Circulo circulo = new Circulo(5);
		Quadrado quadrado = new Quadrado(10);
		
		ArrayList<Forma> formas = new ArrayList<>();
		formas.add(circulo);
		formas.add(quadrado);
		
		for (Forma forma : formas){
			System.out.println("A área do " + forma.getClass().getSimpleName() + " é: " + forma.calcularArea());
		}
	}

}
