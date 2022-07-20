package br.com.cruzvita.cadastro.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.cruzvita.cadastro.dto.PessoaDto;
import br.com.cruzvita.cadastro.model.Pessoa;

public interface CadastroController {

	public ResponseEntity<String> cadastroPessoa(PessoaDto pessoa);
	
	public ResponseEntity<List<Pessoa>> buscaTodasPessoas();
}
