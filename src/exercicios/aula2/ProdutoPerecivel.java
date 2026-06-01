package exercicios.aula2;

public class ProdutoPerecivel extends Produto{

	public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
		super(nome, preco, quantidade);
		this.dataValidade = dataValidade;
	}

	private String dataValidade;

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
}
