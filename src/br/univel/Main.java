package br.univel;

import java.sql.SQLException;

import br.univel.enums.EstadoCivil;

public class Main {

	public Main(){
		
		Cliente c1 = new Cliente();
		c1.setId(1);
		c1.setNome("Evandro");
		c1.setTelefone("99999999");
		c1.setEstadoCivil(EstadoCivil.SOLTEIRO);
		c1.setEndereco("Rua Da champa");
		
		Cliente c2 = new Cliente();
		c2.setId(2);
		c2.setNome("Tonho");
		c2.setTelefone("989898989");
		c2.setEstadoCivil(EstadoCivil.SOLTEIRO);
		c2.setEndereco("Rua asa dourada");
		
		Conexao conexao = new Conexao();
			
		Impl d = new Impl();
		
		try {
			d.setCon(conexao.abrirConexao());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Apagar Tabela\n");
		d.apagarTabela(c1);
		
		System.out.println("Criar Tabela\n");
		d.criarTabela(c1);
		
		System.out.println("Inserir objeto 1\n");
		d.salvar(c1);
		
		System.out.println("Inserir objeto 2\n");
		d.salvar(c2);
		
		System.out.println("listarTodos");
		for(Cliente c : d.listarTodos()){
			System.out.println(c.getId() + " - " + c.getNome() + " - " + c.getEndereco() + " - " + 
							   c.getTelefone() + " - " + c.getEstadoCivil().toString());			
		}
		
		
		System.out.println("\nbuscar objeto 1");
		Cliente c4 = new Cliente();
		c4 = d.buscar(c1.getId());		
		System.out.println(c4.getId() + " - " + c4.getNome() + " - " + c4.getEndereco() + " - " + 
						   c4.getTelefone() + " - " + c4.getEstadoCivil().toString());			

		
		System.out.println("\nalterar objeto 2\n");
		c2.setEstadoCivil(EstadoCivil.CASADO);
		d.atualizar(c2);
		
		System.out.println("listarTodos");		
		for(Cliente c : d.listarTodos()){
			System.out.println(c.getId() + " - " + c.getNome() + " - " + c.getEndereco() + " - " + 
							   c.getTelefone() + " - " + c.getEstadoCivil().toString());			
		}
		
		d.setCon(null);
		try {
			conexao.fecharConexao();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		new Main();
	}
}