package model;

public class Crianca extends Pessoa{
	private String observacoes;

	public Crianca(int id, String nome, String data, int cartaoCidadao, String observacoes) {
		super(id, nome, data, cartaoCidadao);
		this.observacoes = observacoes;
	}

	public String getObservacao() {
		return observacoes;
	}

	public void setObservacao(String observacoes) {
		this.observacoes = observacoes;
	}
	
}
