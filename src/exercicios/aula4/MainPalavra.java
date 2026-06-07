package exercicios.aula4;

import java.util.ArrayList;
import java.util.Collections;

public class MainPalavra {

	public static void main(String[] args) {
		
		Palavra palavra1 = new Palavra();
		Palavra palavra2 = new Palavra();
		
		palavra1.nome = "Python";
		palavra2.nome = "Java";
		
		ArrayList<Palavra> palavras = new ArrayList<>();
		palavras.add(palavra1);
		palavras.add(palavra2);
		
		Collections.sort(palavras);
		System.out.println(palavras);
	}

}
