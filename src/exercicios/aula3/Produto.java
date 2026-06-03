package exercicios.aula3;

public class Produto {
	
	// Exercicio 4
	
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public 	String getNome(){
		return nome;
	}
	
	public double getPreco(){
		return preco;
	}

}
