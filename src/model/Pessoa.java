package model;

public abstract class Pessoa {
	private int id;
	private String nome;
	private String dataNascimento;
	private int cartaoCidadao;
	
	public Pessoa(int id, String nome, String dataNascimento, int cartaoCidadao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cartaoCidadao = cartaoCidadao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return dataNascimento;
	}

	public void setData(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getCartaoCidadao() {
		return cartaoCidadao;
	}

	public void setCartaoCidadao(int cartaoCidadao) {
		this.cartaoCidadao = cartaoCidadao;
	}
	
	
}
