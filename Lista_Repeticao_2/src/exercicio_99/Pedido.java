package exercicio_99;

public class Pedido {

	private int numPedido = 0;
	private int dia;
	private int mes;
	private int ano;
	private double preco;
	private int qtd;

	public Pedido(int dia, int mes, int ano, double preco, int qtd) {
		if ((dia > 0 && dia <= 31) && (mes > 0 && mes <= 12) && ano > 2015 && preco > 0 && qtd > 0) {
			this.numPedido++;
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
			this.preco = preco;
			this.qtd = qtd;
		}
	}

	public Pedido() { }

	public int getNumPedido() {
		return this.numPedido;
	}

	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		if (dia > 0 && dia <= 31)
			this.dia = dia;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		if (mes > 0 && mes <= 12)
			this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco > 0)
			this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		if (qtd > 0)
			this.qtd = qtd;
	}

}
