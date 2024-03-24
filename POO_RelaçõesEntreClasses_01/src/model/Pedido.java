package model;

import java.util.List;

public class Pedido {

	private int numeroNota;
	private double valorTotal = 0;
	private List<itemPedido> itemPed;

	public Pedido(int numeroNota, List<itemPedido> itemPed) {
		super();
		this.numeroNota = numeroNota;
		this.itemPed = itemPed;
	}

	public int getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
	}

	public double getValorTotal() {
		int size = itemPed.size();
		double Total = 0;
		for (int i = 0; i < size; i++) {
			Produto p = itemPed.get(i).getProduto();
			Total = Total + (itemPed.get(i).getQuantidade() * p.getValor());
		}
		valorTotal = Total;
		return valorTotal;
	}
	
	public void adicionarItem(itemPedido itemped) {
		itemPed.add(itemped);
	}

}
