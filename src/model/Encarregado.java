package model;

public class Encarregado extends Pessoa{
	private String contacto;
	private String altContacto;

	public Encarregado(int id, String nome, String data, int cartaoCidadao, String contacto) {
		super(id, nome, data, cartaoCidadao);
		this.contacto = contacto;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getAltContacto() {
		return altContacto;
	}

	public void setAltContacto(String altContacto) {
		this.altContacto = altContacto;
	}
}
