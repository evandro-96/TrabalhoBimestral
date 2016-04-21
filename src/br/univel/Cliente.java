package br.univel;

import br.univel.anotacoes.Coluna;
import br.univel.anotacoes.Tabela;

@Tabela("CAD_CLIENTE")
public class Cliente {
	
	@Coluna(pk=true, nome="CLID")
	private int id;
	
	@Coluna(nome="CLNOME")
	private String nome;
	
	@Coluna(nome="CLEND")
	private String endereco;
	
	@Coluna(nome="CLTEL")
	private String telefone;
	

	
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
