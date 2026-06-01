package exercicios.aula2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Produto teclado = new Produto("Teclado", 50.0, 3);
		Produto mouse = new Produto("Mouse", 23.5, 5);
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		produtos.add(teclado);
		produtos.add(mouse);
		
		System.out.println("Tamanho da lista de produtos: " + produtos.size());
		System.out.println("Primeiro produto da lista: " + produtos.get(0));
		
		ProdutoPerecivel produto3 = new ProdutoPerecivel("Danone", 12.0, 7, "11/12/2026");
		
		for (Produto produto : produtos) {
            System.out.println(produto);
        }
		
	}

}
