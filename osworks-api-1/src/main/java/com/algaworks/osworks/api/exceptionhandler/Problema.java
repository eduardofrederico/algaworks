package com.algaworks.osworks.api.exceptionhandler;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL) // inclui apenas campos que não estão nulos quando um email já existe
public class Problema {
	
	private Integer status;
	private OffsetDateTime datahora;
	private String titulo;
	private List<Campo> campos;
	
	public static class Campo {
		private String mensagem;
		private String nome;
		
		public Campo(String mensagem, String nome) {
			super();
			this.mensagem = mensagem;
			this.nome = nome;
		}
		public String getMensagem() {
			return mensagem;
		}
		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public OffsetDateTime getDatahora() {
		return datahora;
	}
	public void setDatahora(OffsetDateTime datahora) {
		this.datahora = datahora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Campo> getCampos() {
		return campos;
	}
	public void setCampos(List<Campo> campos) {
		this.campos = campos;
	}
}
