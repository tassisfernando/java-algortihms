package exercicio_16;

public class Planta {

	public String nome;
	public int qtdIdeal;
	public int qtdEstoque;
	
	public int getNecessario() {
		return this.qtdIdeal - this.qtdEstoque;
	}
}
