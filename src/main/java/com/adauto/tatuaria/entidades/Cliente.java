package com.adauto.tatuaria.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		
		private Integer cpf;
	
		private String nome;
		private Integer idade;
		private String sexo;
		private String login;
		private String senha;
		
		

		private String parteCorpo;
		private String descrição;
		
		@ManyToMany(mappedBy = "clientes")
		private List<Tatuador> tatuadores = new ArrayList<>();
		
		public Cliente() {
			
		}


		public Cliente(Integer id, Integer cpf, String nome, Integer idade, String sexo, String login, String senha,
				String parteCorpo, String descrição) {
			super();
			this.id = id;
			this.cpf = cpf;
			this.nome = nome;
			this.idade = idade;
			this.sexo = sexo;
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

		public Integer getIdade() {
			return idade;
		}

		public void setIdade(Integer idade) {
			this.idade = idade;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public Integer getCpf() {
			return cpf;
		}

		public void setCpf(Integer cpf) {
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
		
	
		

		public List<Tatuador> getTatuadores() {
			return tatuadores;
		}

		public void setTatuadores(List<Tatuador> tatuadores) {
			this.tatuadores = tatuadores;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
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
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

	
		
}
