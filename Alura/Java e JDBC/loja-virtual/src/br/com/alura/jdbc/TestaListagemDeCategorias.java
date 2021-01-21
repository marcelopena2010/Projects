package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.CategoriaDAO;
import modelo.Categoria;
import modelo.Produto;

public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {

		try(Connection connection = new ConnectionFactory().recuperarConexao()){
			CategoriaDAO categoriaDao = new CategoriaDAO(connection); 
			List<Categoria> listaDeCategorias = categoriaDao.listarComProdutos();
			listaDeCategorias.stream().forEach(ct -> { 
				System.out.println(ct.getNome());
				for(Produto produto : ct.getProdutos()) {
					System.out.println(ct.getNome() + " - " + produto.getNome());
				}		
			});
		}
	}
	
	
}
