package exercicios.aula3;

public class Circulo implements Forma{

	
	// Exercicio 5
	
	public double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}
	
}
