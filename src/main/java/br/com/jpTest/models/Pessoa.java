package br.com.jpTest.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	private int id;
	private String nome;
	private Date dataNasc;
	private String cpf;
	
	public Pessoa(int id, String nome, String dataNasc, String cpf) {
		super();
		this.setId(id);
		this.setNome(nome);
		this.setDataNasc(dataNasc);
		this.setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		try {
			this.dataNasc = new SimpleDateFormat("dd/MM/yyyy").parse(dataNasc);
		} catch (ParseException e) {
			System.out.println("Data de nascimento inválida");
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
