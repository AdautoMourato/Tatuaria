package com.adauto.tatuaria.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
		@Id
		private Long cpf;
	
		private String nome;
		private int idade;
		private String sexo;
		private String login;
		private String senha;
		
		

		private String parteCorpo;
		private String descrição;
		
		
		public Cliente() {
			
		}

		public Cliente(String nome, int idade, String sexo, Long cpf, String login, String senha, String parteCorpo,
				String descrição) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.sexo = sexo;
			this.cpf = cpf;
			this.login = login;
			this.senha = senha;
			this.parteCorpo = parteCorpo;
			this.descrição = descrição;
		}


		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public Long getCpf() {
			return cpf;
		}

		public void setCpf(Long cpf) {
			this.cpf = cpf;
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getParteCorpo() {
			return parteCorpo;
		}


		public void setParteCorpo(String parteCorpo) {
			this.parteCorpo = parteCorpo;
		}


		public String getDescrição() {
			return descrição;
		}


		public void setDescrição(String descrição) {
			this.descrição = descrição;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cliente other = (Cliente) obj;
			if (cpf == null) {
				if (other.cpf != null)
					return false;
			} else if (!cpf.equals(other.cpf))
				return false;
			return true;
		}
		
		
}
