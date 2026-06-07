package exercicios.aula4;

public class Palavra implements Comparable<Palavra>{

	String nome;
	
	@Override
	public int compareTo(Palavra outraPalavra){
		return this.nome.compareTo(outraPalavra.nome);
	}
	
	@Override
	public String toString(){
		return this.nome;
	}
}
