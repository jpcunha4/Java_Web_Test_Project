package br.com.jpTest.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PessoaList {
	
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public boolean cadastrarPessoa(String nome, String dataNasc, String cpf) {
		return pessoas.add(new Pessoa(pessoas.size()+1, nome, dataNasc, cpf));
	}
	
	public boolean removerPessoa(int id) throws Exception{
		for(Pessoa p:this.pessoas) {
			if(p.getId() == id) {
				return pessoas.remove(p);
			}
		}
		
		return false;
	}
	
	public Pessoa buscaPessoa(int id) {
		for(Pessoa p:pessoas) {
			if(p.getId() == id) {
				return p;
			}
		}
		
		return new Pessoa(0,"","","");
	}
	
	public boolean editarDados(int id, String nome, String dataNasc, String cpf) {
		
		Pessoa p = this.buscaPessoa(id);
		if(p.getId() != 0) {
			if(nome != "") {
				p.setNome(nome);
			}
			
			if(dataNasc != "") {
				System.out.println(dataNasc);
				p.setDataNasc(dataNasc);
			}
			
			if(cpf != "") {
				p.setCpf(cpf);
			}
			
			System.out.println(pessoas.set(id-1, p));
			return true;
		}else {
			return false;
		}
	}
	
	public List<Pessoa> getPessoas(){
		return this.pessoas;
	}
}
