package br.univel;

import br.univel.anotacoes.Tabela;
import br.univel.enums.EstadoCivil;

@Tabela("CAD_CLIENTE")
public class Cliente {
	
	private int id;
	private String nome;
	private String endereco;
	private String telefone;
	
	EstadoCivil estadoCivil = br.univel.enums.EstadoCivil.CASADO;
	
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}
