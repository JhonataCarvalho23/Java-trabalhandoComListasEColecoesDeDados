package exercicios.aula3;

public class Quadrado implements Forma{
	// Exercicio 5
	
	public double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}
	
	
}
