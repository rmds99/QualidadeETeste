package fatura;

import java.util.Date;

import javax.xml.crypto.Data;

public class Fatura {
	private String nome;
	private Date data;	 
	private double valor; 
	private String pago;
	
	public Fatura(String nome, Date data, double valor, String pago) {
		super();
		this.data = data;
		this.nome = nome;
		this.valor = valor;
		this.pago = pago;
	}
	public String getName() {
		return nome;
	}
}