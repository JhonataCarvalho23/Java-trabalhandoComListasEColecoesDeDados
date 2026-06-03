package exercicios.aula3;

public class Animal {
	
	// Exercicio 2 
	
	
	private String nome;
	private String som;
	
	public Animal(String nome, String som){
		this.setNome(nome);
		this.setSom(som);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
}
