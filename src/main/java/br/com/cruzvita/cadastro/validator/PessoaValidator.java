package br.com.cruzvita.cadastro.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import br.com.cruzvita.cadastro.dto.PessoaDto;
import br.com.cruzvita.cadastro.enums.TipoIdentificador;
import br.com.cruzvita.cadastro.exceptions.IdentificadorInvalidoException;
import br.com.cruzvita.cadastro.model.Pessoa;

@Service
public class PessoaValidator {
	

	private static final Logger log = LogManager.getLogger("PessoaValidator");
	
	private static final int MAXIMO_CARACTERES_CPF = 11;
	private static final int MAXIMO_CARACTERES_CNPJ = 14;

	public void validaCampos(PessoaDto pessoa) {
		log.info("INICIANDO VALIDAÇÃO DE DADOS PESSOA " + pessoa.toString());
		if (existeIdentificador(pessoa)) {
			ehCpfOuCnpj(pessoa);
		}
	}
	
	private Boolean existeIdentificador(PessoaDto pessoa) {
		return (!pessoa.getIdentificador().isEmpty() && pessoa.getIdentificador() != null) ? Boolean.TRUE : Boolean.FALSE;
	}

	private void ehCpfOuCnpj(PessoaDto pessoa) {
		if (pessoa.getIdentificador().length() == MAXIMO_CARACTERES_CPF) {
			pessoa.setTipoIdentificador(TipoIdentificador.CPF.toString());
			return;
		} else if (pessoa.getIdentificador().length() == MAXIMO_CARACTERES_CNPJ) {
			pessoa.setTipoIdentificador(TipoIdentificador.CNPJ.toString());
			return;
		}
		throw new IdentificadorInvalidoException();
	}

}
