package com.adauto.tatuaria.entidades;

public class Cliente extends Pessoa{

		private String parteCorpo;
		private String descrição;
		
		
		public Cliente() {
			
		}


		public Cliente(String parteCorpo, String descrição) {
			super();
			this.parteCorpo = parteCorpo;
			this.descrição = descrição;
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
		
		
}
