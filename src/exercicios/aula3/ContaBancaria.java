package exercicios.aula3;

public class ContaBancaria {

	// Exercicio 6
	private int numeroConta;
	private double saldo;

	public ContaBancaria(int numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
}