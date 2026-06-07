package exercicios.aula4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listas {
	public static void main(String[] args){
		List<String> ArrayList = new ArrayList<>();
		ArrayList.add("Java");
		ArrayList.add("Python");
		
		List<String> LinkedList = new LinkedList<>();
		LinkedList.add("C#");
		LinkedList.add("php");
		
		System.out.println(LinkedList);
		System.out.println(ArrayList);
		
		
		List<String> listaPoliformica;
		
		listaPoliformica = new ArrayList<>();
		listaPoliformica.add("Ruby");
		listaPoliformica.add("JavaScript");
		
		System.out.println(listaPoliformica);
		
		listaPoliformica = new LinkedList<>();
		listaPoliformica.add("C");
		listaPoliformica.add("C'++");
		
		System.out.println(listaPoliformica);
	}
}

