package br.com.cruzvita.cadastro.service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cruzvita.cadastro.dto.PessoaDto;
import br.com.cruzvita.cadastro.model.Pessoa;
import br.com.cruzvita.cadastro.repository.PessoaRepository;
import br.com.cruzvita.cadastro.validator.PessoaValidator;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class CadastroService {
	
	private static final Logger log = LogManager.getLogger("CadastroService");
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private PessoaValidator pessoaValidator;
	
	public void cadastrarPessoa(PessoaDto pessoa) {
		try {
			pessoaValidator.validaCampos(pessoa);
			pessoaRepository.save(new Pessoa(pessoa));
		} catch (Exception e) {
			log.error("Erro= {" + e.getMessage() + "} Tipo= {" + e.getClass()+"}");
			e.printStackTrace();
		}
	}

	public List<Pessoa> buscaTodasPessoas() {
		return pessoaRepository.findAll();
	}
	
}
