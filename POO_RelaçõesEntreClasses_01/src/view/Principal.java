package view;

import java.util.ArrayList;
import java.util.List;

import model.Pedido;
import model.Produto;
import model.itemPedido;

public class Principal {

	public static void main(String[] args) {
		Produto p1 = new Produto(001,200, "D&D 5E: Livro do Jogador.");
		Produto p2 = new Produto(002,250, "D&D 5E: Livro do Mestre.");
		Produto p3 = new Produto(003,120, "D&D 5E: Manual dos Monstros.");
		
		itemPedido ip1 = new itemPedido(5, p1);
		itemPedido ip2 = new itemPedido(1, p2);
		itemPedido ip3 = new itemPedido(2, p3);
		
		List<itemPedido>Pedidos = new ArrayList<itemPedido>();
		
		Pedidos.add(ip3);
		Pedidos.add(ip2);
		Pedidos.add(ip1);
		
		Pedido p = new Pedido(1467, Pedidos);
		
		System.out.println("O total do pedido é: R$"+p.getValorTotal());
	}

}
