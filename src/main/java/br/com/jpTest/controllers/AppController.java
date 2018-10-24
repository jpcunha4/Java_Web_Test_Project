package br.com.jpTest.controllers;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.jpTest.models.Pessoa;
import br.com.jpTest.models.PessoaList;

@RestController
@RequestMapping("/new")
public class AppController {
	
	@Autowired
	PessoaList pessoas;
	
	@ResponseBody
	@PostMapping("/")
	public boolean cadastraPessoa(@RequestBody Pessoa p) {
		System.out.println(p.getDataNasc().toString());
		return pessoas.cadastrarPessoa(p.getNome(), new SimpleDateFormat("dd/MM/yyyy").format(p.getDataNasc()), p.getCpf());
	}
	
	@ResponseBody
	@GetMapping("/{id}")
	public Pessoa getPessoa(@PathVariable(name="id", required=true) int id) {
		return pessoas.buscaPessoa(id);
	}
}
