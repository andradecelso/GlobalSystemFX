package DAO;

import java.util.ArrayList;
import java.util.List;

import entidades.Pessoa;

public class PessoaDAO {

	
	public static List<Pessoa> listaPessoas = new ArrayList<>();
	
	
	public static PessoaDAO instance;
	
	public static PessoaDAO getInstance() {
		if(instance == null)
			instance = new PessoaDAO();
		
		
		return instance;
		
	}
	
	
	public void adicionarPessoa(Pessoa pessoa) {
		
		
		listaPessoas.add(pessoa);
		
		}
	
	public void removerPessoa(Pessoa pessoa) {
		
		listaPessoas.remove(pessoa);
		
	}
	
	
	public List<Pessoa> listarPessoas(){
		
		return listaPessoas;
		
	}
	
	
}
