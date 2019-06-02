package exercicio_99;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_99 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		List<Pedido> pedidos = lerPedidos();

		finalizarCompra(pedidos);

		scn.close();
	}

	public static List<Pedido> lerPedidos() {
		Scanner scn = new Scanner(System.in);
		int escolha = 1;

		List<Pedido> pedidos = new ArrayList<Pedido>();
		Pedido pedido = new Pedido();

		int dia, mes, ano, qtd;
		double preco;

		while (escolha != 0) {
			System.out.println("Informe a data do pedido:\nDia: ");
			dia = scn.nextInt();

			System.out.println("Mês: ");
			mes = scn.nextInt();

			System.out.println("Ano: ");
			ano = scn.nextInt();

			System.out.println("Preço unitário: ");
			preco = scn.nextDouble();

			System.out.println("Quantidade: ");
			qtd = scn.nextInt();

			pedido = new Pedido(dia, mes, ano, preco, qtd);
			if (pedido.getNumPedido() != 0) {
				pedidos.add(pedido);
			}

			System.out.println("Deseja cadastrar outro? \n0- Não \n1- Sim");
			escolha = scn.nextInt();
		}
		scn.close();
		return pedidos;
	}

	public static void finalizarCompra(List<Pedido> pedidos) {
		if (pedidos.size() > 0) {
			Compra compra = new Compra(pedidos);

			System.out.println("Compra finalizada!");
			System.out.println("Pedido - Data - Preco - Qtd - Total");
			for (int i = 0; i < compra.getPedidos().size(); i++) {
				System.out.println(compra.getPedidos().get(i).getNumPedido() + " - "
						+ compra.getPedidos().get(i).getDia() + "/" + compra.getPedidos().get(i).getMes() + "/"
						+ compra.getPedidos().get(i).getAno() + " - " + compra.getPedidos().get(i).getPreco() + " - "
						+ compra.getPedidos().get(i).getQtd() + " - "
						+ (compra.getPedidos().get(i).getPreco() * compra.getPedidos().get(i).getQtd()));
			}
			System.out.println("Preço total: " + compra.getPrecoTotal());
		} else {
			System.out.println("Não foram informados produtos.");
		}
	}
}
