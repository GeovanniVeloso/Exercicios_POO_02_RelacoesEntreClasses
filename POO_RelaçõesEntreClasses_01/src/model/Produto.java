package model;

public class Produto {

	private int codigo;
	private double valor;
	private String descrição;

	public Produto(int codigo, double valor, String descrição) {
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.descrição = descrição;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

}
