package br.com.cruzvita.cadastro.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cruzvita.cadastro.controller.CadastroController;
import br.com.cruzvita.cadastro.dto.PessoaDto;
import br.com.cruzvita.cadastro.model.Pessoa;
import br.com.cruzvita.cadastro.service.CadastroService;
import lombok.NoArgsConstructor;

@RestController
@NoArgsConstructor
public class CadastroControllerImpl implements CadastroController {

	@Autowired
	private CadastroService cadastroService;

	@PostMapping("/cadastro")
	@Override
	public ResponseEntity<String> cadastroPessoa(PessoaDto pessoa) {
		try {
			cadastroService.cadastrarPessoa(pessoa);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping
	@Override
	public ResponseEntity<List<Pessoa>> buscaTodasPessoas() {
		try {
			return ResponseEntity.ok().body(cadastroService.buscaTodasPessoas());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
