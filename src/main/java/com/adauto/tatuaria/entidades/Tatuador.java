package com.adauto.tatuaria.entidades;

import java.util.HashSet;
import java.util.Set;

public class Tatuador {

	private String nome;
	private int idade;
	private String sexo;
	private String cpf;
	private String login;
	private String senha;
	
	private Set<Cliente> clientes = new HashSet<Cliente>();
	
	public Tatuador() {
		
	}

	public Tatuador(String nome, int idade, String sexo, String cpf, String login, String senha) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
	}
	
	
	
}
