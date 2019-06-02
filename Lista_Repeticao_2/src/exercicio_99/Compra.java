package exercicio_99;

import java.util.List;

public class Compra {
	
	private List<Pedido>pedidos;
	private double precoTotal;
	
	public Compra(List<Pedido> pedidos) {
		if(pedidos != null) {
			this.pedidos = pedidos;
			this.calcularPreco();
		}
	}
	
	private void calcularPreco() {
		for (int i = 0; i < this.pedidos.size(); i++) {
			if(this.pedidos.get(i) != null) {
				this.precoTotal += this.pedidos.get(i).getPreco()*this.pedidos.get(i).getQtd();
			}
		}
	}
	
	public double getPrecoTotal() {
		return precoTotal;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		if(pedidos != null && pedidos.size() > 0)
			this.pedidos = pedidos;
	}
}
