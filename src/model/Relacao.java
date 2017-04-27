package model;

import java.util.ArrayList;

public class Relacao {
	private String tipo;
	private ArrayList<Crianca> c=new ArrayList<Crianca>();
	private ArrayList<Encarregado> e=new ArrayList<Encarregado>();
	
	public Relacao(String tipo, ArrayList<Crianca> c, ArrayList<Encarregado> e) {
		super();
		this.tipo = tipo;
		this.c = c;
		this.e = e;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public ArrayList<Crianca> getC() {
		return c;
	}
	
	public void setC(ArrayList<Crianca> c) {
		this.c = c;
	}
	
	public ArrayList<Encarregado> getE() {
		return e;
	}
	
	public void setE(ArrayList<Encarregado> e) {
		this.e = e;
	}
	
}
