package exercicios.aula3;

import java.util.ArrayList;
public class MainProduto {
	public static void main(String[] args){
		
		// Exercicio 4
		
		Produto produto1 = new Produto("Danone", 12);
		Produto produto2 = new Produto("Milho em conserva", 4.79);
		Produto produto3 = new Produto("Bolacha", 3.49);
		
		ArrayList<Produto> produtos = new ArrayList<>();
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		
		double somaDosPrecos = 0;
		
		for (Produto produto : produtos){
			somaDosPrecos += produto.getPreco();
		}
		
		double precoMedio = somaDosPrecos / produtos.size();
		System.out.println("O preço médio dos produtos é: " + precoMedio);
		
	}
}
